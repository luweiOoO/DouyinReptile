package com.luwei.DouyinReptile.entity.res.topic;

import com.luwei.DouyinReptile.entity.res.DouYinUriAndUrlRes;

import java.io.Serializable;

/**
 * 抖音主题下视频--视频作者相关信息类
 */
public class DouYinTopicAwemeAuthorDetailRes implements Serializable {

    private DouYinUriAndUrlRes avatar_thumb;

    private DouYinUriAndUrlRes avatar_medium;

    private DouYinUriAndUrlRes avatar_larger;

    private String unique_id;

    private Object platform_sync_info;

    private String uid;

    /**
     * 作者昵称
     */
    private String nickname;

    /**
     * 作者签名
     */
    private String signature;

    private Object poilcy_version;

    private String short_id;

    private Object followers_detail;

    private Object geofencing;

    private Object type_label;

    public DouYinUriAndUrlRes getAvatar_thumb() {
        return avatar_thumb;
    }

    public void setAvatar_thumb(DouYinUriAndUrlRes avatar_thumb) {
        this.avatar_thumb = avatar_thumb;
    }

    public DouYinUriAndUrlRes getAvatar_medium() {
        return avatar_medium;
    }

    public void setAvatar_medium(DouYinUriAndUrlRes avatar_medium) {
        this.avatar_medium = avatar_medium;
    }

    public DouYinUriAndUrlRes getAvatar_larger() {
        return avatar_larger;
    }

    public void setAvatar_larger(DouYinUriAndUrlRes avatar_larger) {
        this.avatar_larger = avatar_larger;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public Object getPlatform_sync_info() {
        return platform_sync_info;
    }

    public void setPlatform_sync_info(Object platform_sync_info) {
        this.platform_sync_info = platform_sync_info;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Object getPoilcy_version() {
        return poilcy_version;
    }

    public void setPoilcy_version(Object poilcy_version) {
        this.poilcy_version = poilcy_version;
    }

    public String getShort_id() {
        return short_id;
    }

    public void setShort_id(String short_id) {
        this.short_id = short_id;
    }

    public Object getFollowers_detail() {
        return followers_detail;
    }

    public void setFollowers_detail(Object followers_detail) {
        this.followers_detail = followers_detail;
    }

    public Object getGeofencing() {
        return geofencing;
    }

    public void setGeofencing(Object geofencing) {
        this.geofencing = geofencing;
    }

    public Object getType_label() {
        return type_label;
    }

    public void setType_label(Object type_label) {
        this.type_label = type_label;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeAuthorDetailRes{" +
                "avatar_thumb=" + avatar_thumb +
                ", avatar_medium=" + avatar_medium +
                ", avatar_larger=" + avatar_larger +
                ", unique_id='" + unique_id + '\'' +
                ", platform_sync_info=" + platform_sync_info +
                ", uid='" + uid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", signature='" + signature + '\'' +
                ", poilcy_version=" + poilcy_version +
                ", short_id='" + short_id + '\'' +
                ", followers_detail=" + followers_detail +
                ", geofencing=" + geofencing +
                ", type_label=" + type_label +
                '}';
    }
}
