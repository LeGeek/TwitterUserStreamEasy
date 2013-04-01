package fr.univaix.iut.pokebattle.tuse;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.endpoint.UserstreamEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.BasicClient;
import com.twitter.hbc.httpclient.ControlStreamException;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;
import com.twitter.hbc.twitter4j.Twitter4jUserstreamClient;
import twitter4j.UserStreamListener;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class TwitterUserStreamEasy {
    private UserStreamListener listener;
    private Credentials credentials;

    /**
     * @deprecated Not for public use.
     *             This method don't initialize the credentials and could be responsible of a NullPointerException.
     *             Replaced by {@link #TwitterUserStreamEasy(UserStreamListener, Credentials)}
     */
    @Deprecated
    public TwitterUserStreamEasy(UserStreamListener listener) {
        this.listener = listener;
    }

    public TwitterUserStreamEasy(UserStreamListener listener, Credentials credentials) {
        this.listener = listener;
        this.credentials = credentials;
    }


    private void oauth(String consumerKey, String consumerSecret, String token, String tokenSecret)
            throws InterruptedException, ControlStreamException, IOException {
        // Create an appropriately sized blocking queue
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10000);
        BlockingQueue<Event> eventQueue = new LinkedBlockingQueue<Event>(1000);

        // Define our endpoint: By default, delimited=length is set (we need
        // this for our processor)
        // and stall warnings are on.
        UserstreamEndpoint endpoint = new UserstreamEndpoint();
        endpoint.withFollowings(false);

        Authentication auth = new OAuth1(consumerKey, consumerSecret, token, tokenSecret);

        // Create a new BasicClient. By default gzip is enabled.
        BasicClient client = new ClientBuilder().hosts(Constants.USERSTREAM_HOST).endpoint(endpoint)
                .authentication(auth).processor(new StringDelimitedProcessor(queue)).eventMessageQueue(eventQueue)
                .build();

        // Create an executor service which will spawn threads to do the actual
        // work of parsing the incoming messages and
        // calling the listeners on each message
        int numProcessingThreads = 4;
        ExecutorService service = Executors.newFixedThreadPool(numProcessingThreads);

        // Wrap our BasicClient with the twitter4j client
        Twitter4jUserstreamClient t4jClient = new Twitter4jUserstreamClient(client, queue,
                Lists.newArrayList(listener), service);

        // Establish a connection
        t4jClient.connect();
        for (int threads = 0; threads < numProcessingThreads; threads++) {
            // This must be called once per processing thread
            t4jClient.process();
        }
    }

    public void oauth(Credentials credentials)
            throws InterruptedException, ControlStreamException, IOException {
        oauth(credentials.getConsumerKey(), credentials.getConsumerSecret(), credentials.getToken(), credentials.getTokenSecret());
    }

    public void oauth() throws InterruptedException, ControlStreamException, IOException {
        if (credentials != null)
            oauth(credentials);
        else {
            throw new RuntimeException("Credentials shouldn't be null. Use the constructor TwitterUserStreamEasy(UserStreamListener, Credentials)  instead of #TwitterUserStreamEasy(UserStreamListener)");
        }
    }
}
