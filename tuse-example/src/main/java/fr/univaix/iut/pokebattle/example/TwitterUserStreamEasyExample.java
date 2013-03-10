package fr.univaix.iut.pokebattle.example;


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
            TwitterUserStreamEasy twitterUserStreamEasy = new TwitterUserStreamEasy(listener);

            // Run threads that waiting events on user stream
            twitterUserStreamEasy.oauth(args[0], args[1], args[2], args[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
