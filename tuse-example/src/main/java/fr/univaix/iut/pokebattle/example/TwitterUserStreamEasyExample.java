package fr.univaix.iut.pokebattle.example;


import fr.univaix.iut.pokebattle.tuse.Credentials;
import fr.univaix.iut.pokebattle.tuse.TwitterUserStreamEasy;
import fr.univaix.iut.pokebattle.tuse.UserStreamAdapter;
import twitter4j.Status;
import twitter4j.UserStreamListener;

public class TwitterUserStreamEasyExample {
    private static UserStreamListener listener = new UserStreamAdapter() {
        @Override
        public void onStatus(Status status) {
            System.out.println("TwitterUserStreamEasyExample.onStatus");
            System.out.println("status = [" + status + "]");
        }
    };

    public static void main(String[] args) {
        try {
            Credentials credentials = new Credentials();
            credentials.setConsumerKey(args[0]);
            credentials.setConsumerSecret(args[1]);
            credentials.setToken(args[2]);
            credentials.setTokenSecret(args[3]);

            TwitterUserStreamEasy twitterUserStreamEasy = new TwitterUserStreamEasy(listener,credentials);

            // Run threads that waiting events on user stream
            twitterUserStreamEasy.oauth();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
