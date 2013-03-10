package fr.univaix.iut.pokebattle.tuse;

import com.twitter.hbc.twitter4j.handler.UserstreamHandler;
import com.twitter.hbc.twitter4j.message.DisconnectMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.*;

public class UserStreamAdapter implements UserstreamHandler {
    private final static Logger logger = LoggerFactory.getLogger(UserStreamAdapter.class);

    @Override
    public void onDisconnectMessage(DisconnectMessage disconnectMessage) {
        logger.info("Unimplemented event handler: onDisconnectMessage");
    }

    @Override
    public void onUnfollow(User user, User user2) {
        logger.info("Unimplemented event handler: onUnfollow");
    }

    @Override
    public void onUnknownMessageType(String s) {
        logger.info("Unimplemented event handler: onUnknownMessageType");
    }

    @Override
    public void onDeletionNotice(long directMessageId, long userId) {
        logger.info("Unimplemented event handler: onDeletionNotice");
    }

    @Override
    public void onFriendList(long[] friendIds) {
        logger.info("Unimplemented event handler: onFriendList");
    }

    @Override
    public void onFavorite(User source, User target, Status favoritedStatus) {
        logger.info("Unimplemented event handler: onFavorite");
    }

    @Override
    public void onUnfavorite(User source, User target, Status unfavoritedStatus) {
        logger.info("Unimplemented event handler: onUnfavorite");
    }

    @Override
    public void onFollow(User source, User followedUser) {
        logger.info("Unimplemented event handler: onFollow");
    }

    @Override
    public void onRetweet(User source, User target, Status retweetedStatus) {
        logger.info("Unimplemented event handler: onRetweet");
    }

    @Override
    public void onDirectMessage(DirectMessage directMessage) {
        logger.info("Unimplemented event handler: onDirectMessage");
    }

    @Override
    public void onUserListMemberAddition(User addedMember, User listOwner, UserList list) {
        logger.info("Unimplemented event handler: onUserListMemberAddition");
    }

    @Override
    public void onUserListMemberDeletion(User deletedMember, User listOwner, UserList list) {
        logger.info("Unimplemented event handler: onUserListMemberDeletion");
    }

    @Override
    public void onUserListSubscription(User subscriber, User listOwner, UserList list) {
        logger.info("Unimplemented event handler: onUserListSubscription");
    }

    @Override
    public void onUserListUnsubscription(User subscriber, User listOwner, UserList list) {
        logger.info("Unimplemented event handler: onUserListUnsubscription");
    }

    @Override
    public void onUserListCreation(User listOwner, UserList list) {
        logger.info("Unimplemented event handler: onUserListCreation");
    }

    @Override
    public void onUserListUpdate(User listOwner, UserList list) {
        logger.info("Unimplemented event handler: onUserListUpdate");
    }

    @Override
    public void onUserListDeletion(User listOwner, UserList list) {
        logger.info("Unimplemented event handler: onUserListDeletion");
    }

    @Override
    public void onUserProfileUpdate(User updatedUser) {
        logger.info("Unimplemented event handler: onUserProfileUpdate");
    }

    @Override
    public void onBlock(User source, User blockedUser) {
        logger.info("Unimplemented event handler: onBlock");
    }

    @Override
    public void onUnblock(User source, User unblockedUser) {
        logger.info("Unimplemented event handler: onUnblock");
    }

    @Override
    public void onStatus(Status status) {
        logger.info("Unimplemented event handler: onStatus");
    }

    @Override
    public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
        logger.info("Unimplemented event handler: onDeletionNotice");
    }

    @Override
    public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
        logger.info("Unimplemented event handler: onTrackLimitationNotice");
    }

    @Override
    public void onScrubGeo(long userId, long upToStatusId) {
        logger.info("Unimplemented event handler: onScrubGeo");
    }

    @Override
    public void onException(Exception ex) {
        logger.info("Unimplemented event handler: onException");
    }
}
