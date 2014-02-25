package fr.univaix.iut.pokebattle.tuse;

import com.twitter.hbc.twitter4j.handler.UserstreamHandler;
import com.twitter.hbc.twitter4j.message.DisconnectMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.*;

public class UserStreamAdapter implements UserstreamHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserStreamAdapter.class);
    private static final String UNIMPLEMENTED_EVENT_HANDLER = "Unimplemented event handler: ";

    @Override
    public void onDisconnectMessage(DisconnectMessage disconnectMessage) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onDisconnectMessage");
    }

    @Override
    public void onUnfollow(User user, User user2) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUnfollow");
    }

    @Override
    public void onUnknownMessageType(String s) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUnknownMessageType");
    }

    @Override
    public void onDeletionNotice(long directMessageId, long userId) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onDeletionNotice");
    }

    @Override
    public void onFriendList(long[] friendIds) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onFriendList");
    }

    @Override
    public void onFavorite(User source, User target, Status favoritedStatus) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onFavorite");
    }

    @Override
    public void onUnfavorite(User source, User target, Status unfavoritedStatus) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUnfavorite");
    }

    @Override
    public void onFollow(User source, User followedUser) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onFollow");
    }

    @Override
    public void onRetweet(User source, User target, Status retweetedStatus) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onRetweet");
    }

    @Override
    public void onDirectMessage(DirectMessage directMessage) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onDirectMessage");
    }

    @Override
    public void onUserListMemberAddition(User addedMember, User listOwner, UserList list) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserListMemberAddition");
    }

    @Override
    public void onUserListMemberDeletion(User deletedMember, User listOwner, UserList list) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserListMemberDeletion");
    }

    @Override
    public void onUserListSubscription(User subscriber, User listOwner, UserList list) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserListSubscription");
    }

    @Override
    public void onUserListUnsubscription(User subscriber, User listOwner, UserList list) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserListUnsubscription");
    }

    @Override
    public void onUserListCreation(User listOwner, UserList list) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserListCreation");
    }

    @Override
    public void onUserListUpdate(User listOwner, UserList list) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserListUpdate");
    }

    @Override
    public void onUserListDeletion(User listOwner, UserList list) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserListDeletion");
    }

    @Override
    public void onUserProfileUpdate(User updatedUser) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUserProfileUpdate");
    }

    @Override
    public void onBlock(User source, User blockedUser) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onBlock");
    }

    @Override
    public void onUnblock(User source, User unblockedUser) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onUnblock");
    }

    @Override
    public void onStatus(Status status) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onStatus");
    }

    @Override
    public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onDeletionNotice");
    }

    @Override
    public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onTrackLimitationNotice");
    }

    @Override
    public void onScrubGeo(long userId, long upToStatusId) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onScrubGeo");
    }

    @Override
    public void onException(Exception ex) {
        LOGGER.info(UNIMPLEMENTED_EVENT_HANDLER + "onException");
    }
}
