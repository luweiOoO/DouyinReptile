package com.luwei.DouyinReptile.entity.res.topic;

import com.luwei.DouyinReptile.entity.res.DouYinUriAndUrlRes;

import java.io.Serializable;

public class DouYinTopicAwemeChaDetailRes implements Serializable {

    private String cha_name;

    private Integer type;

    private Integer view_count;

    private String hash_tag_profile;

    private Boolean is_commerce;

    private String cid;

    private String desc;

    private Integer user_count;

    private Object connect_music;

    private DouYinUriAndUrlRes cover_item;

    public String getCha_name() {
        return cha_name;
    }

    public void setCha_name(String cha_name) {
        this.cha_name = cha_name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public String getHash_tag_profile() {
        return hash_tag_profile;
    }

    public void setHash_tag_profile(String hash_tag_profile) {
        this.hash_tag_profile = hash_tag_profile;
    }

    public Boolean getIs_commerce() {
        return is_commerce;
    }

    public void setIs_commerce(Boolean is_commerce) {
        this.is_commerce = is_commerce;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getUser_count() {
        return user_count;
    }

    public void setUser_count(Integer user_count) {
        this.user_count = user_count;
    }

    public Object getConnect_music() {
        return connect_music;
    }

    public void setConnect_music(Object connect_music) {
        this.connect_music = connect_music;
    }

    public DouYinUriAndUrlRes getCover_item() {
        return cover_item;
    }

    public void setCover_item(DouYinUriAndUrlRes cover_item) {
        this.cover_item = cover_item;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeChaDetailRes{" +
                "cha_name='" + cha_name + '\'' +
                ", type=" + type +
                ", view_count=" + view_count +
                ", hash_tag_profile='" + hash_tag_profile + '\'' +
                ", is_commerce=" + is_commerce +
                ", cid='" + cid + '\'' +
                ", desc='" + desc + '\'' +
                ", user_count=" + user_count +
                ", connect_music=" + connect_music +
                ", cover_item=" + cover_item +
                '}';
    }
}
