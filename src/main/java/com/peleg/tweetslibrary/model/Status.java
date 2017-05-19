package com.peleg.tweetslibrary.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hannypeleg on 5/18/17.
 */

    public class Status {

        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("id")
        @Expose
        private double id;
        @SerializedName("id_str")
        @Expose
        private String idStr;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("truncated")
        @Expose
        private boolean truncated;
        @SerializedName("entities")
        @Expose
        private Entities entities;

        @SerializedName("source")
        @Expose
        private String source;
        @SerializedName("in_reply_to_status_id")
        @Expose
        private Object inReplyToStatusId;
        @SerializedName("in_reply_to_status_id_str")
        @Expose
        private Object inReplyToStatusIdStr;
        @SerializedName("in_reply_to_user_id")
        @Expose
        private Object inReplyToUserId;
        @SerializedName("in_reply_to_user_id_str")
        @Expose
        private Object inReplyToUserIdStr;
        @SerializedName("in_reply_to_screen_name")
        @Expose
        private Object inReplyToScreenName;
        @SerializedName("user")
        @Expose
        private User user;
        @SerializedName("geo")
        @Expose
        private Object geo;
        @SerializedName("coordinates")
        @Expose
        private Object coordinates;
        @SerializedName("place")
        @Expose
        private Object place;
        @SerializedName("contributors")
        @Expose
        private Object contributors;
        @SerializedName("is_quote_status")
        @Expose
        private boolean isQuoteStatus;
        @SerializedName("retweet_count")
        @Expose
        private int retweetCount;
        @SerializedName("favorite_count")
        @Expose
        private int favoriteCount;
        @SerializedName("favorited")
        @Expose
        private boolean favorited;
        @SerializedName("retweeted")
        @Expose
        private boolean retweeted;
        @SerializedName("possibly_sensitive")
        @Expose
        private boolean possiblySensitive;
        @SerializedName("lang")
        @Expose
        private String lang;

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public double getId() {
            return id;
        }

        public void setId(double id) {
            this.id = id;
        }

        public String getIdStr() {
            return idStr;
        }

        public void setIdStr(String idStr) {
            this.idStr = idStr;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public boolean isTruncated() {
            return truncated;
        }

        public void setTruncated(boolean truncated) {
            this.truncated = truncated;
        }

        public Entities getEntities() {
            return entities;
        }

        public void setEntities(Entities entities) {
            this.entities = entities;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public Object getInReplyToStatusId() {
            return inReplyToStatusId;
        }

        public void setInReplyToStatusId(Object inReplyToStatusId) {
            this.inReplyToStatusId = inReplyToStatusId;
        }

        public Object getInReplyToStatusIdStr() {
            return inReplyToStatusIdStr;
        }

        public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
            this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        }

        public Object getInReplyToUserId() {
            return inReplyToUserId;
        }

        public void setInReplyToUserId(Object inReplyToUserId) {
            this.inReplyToUserId = inReplyToUserId;
        }

        public Object getInReplyToUserIdStr() {
            return inReplyToUserIdStr;
        }

        public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
            this.inReplyToUserIdStr = inReplyToUserIdStr;
        }

        public Object getInReplyToScreenName() {
            return inReplyToScreenName;
        }

        public void setInReplyToScreenName(Object inReplyToScreenName) {
            this.inReplyToScreenName = inReplyToScreenName;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Object getGeo() {
            return geo;
        }

        public void setGeo(Object geo) {
            this.geo = geo;
        }

        public Object getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Object coordinates) {
            this.coordinates = coordinates;
        }

        public Object getPlace() {
            return place;
        }

        public void setPlace(Object place) {
            this.place = place;
        }

        public Object getContributors() {
            return contributors;
        }

        public void setContributors(Object contributors) {
            this.contributors = contributors;
        }


        public boolean isIsQuoteStatus() {
            return isQuoteStatus;
        }

        public void setIsQuoteStatus(boolean isQuoteStatus) {
            this.isQuoteStatus = isQuoteStatus;
        }

        public int getRetweetCount() {
            return retweetCount;
        }

        public void setRetweetCount(int retweetCount) {
            this.retweetCount = retweetCount;
        }

        public int getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public boolean isFavorited() {
            return favorited;
        }

        public void setFavorited(boolean favorited) {
            this.favorited = favorited;
        }

        public boolean isRetweeted() {
            return retweeted;
        }

        public void setRetweeted(boolean retweeted) {
            this.retweeted = retweeted;
        }

        public boolean isPossiblySensitive() {
            return possiblySensitive;
        }

        public void setPossiblySensitive(boolean possiblySensitive) {
            this.possiblySensitive = possiblySensitive;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

}
