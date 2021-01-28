package com.luwei.DouyinReptile.entity.res.topic;

import com.luwei.DouyinReptile.entity.res.DouYinUriAndUrlRes;

import java.io.Serializable;

/**
 * 抖音主题下视频信息--音乐信息参数类
 */
public class DouYinTopicAwemeMusicDetailRes implements Serializable {


    private String title;

    private DouYinUriAndUrlRes cover_large;

    private DouYinUriAndUrlRes play_url;

    private Object position;

    private DouYinUriAndUrlRes cover_medium;

    private DouYinUriAndUrlRes cover_thumb;

    /**
     * 音乐时长（s）
     */
    private Integer duration;

    private Integer status;

    /**
     * 音乐id
     */
    private Long id;

    private String mid;

    /**
     * 作者名字
     */
    private String author;

    private DouYinUriAndUrlRes  cover_hd;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DouYinUriAndUrlRes getCover_large() {
        return cover_large;
    }

    public void setCover_large(DouYinUriAndUrlRes cover_large) {
        this.cover_large = cover_large;
    }

    public DouYinUriAndUrlRes getPlay_url() {
        return play_url;
    }

    public void setPlay_url(DouYinUriAndUrlRes play_url) {
        this.play_url = play_url;
    }

    public Object getPosition() {
        return position;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    public DouYinUriAndUrlRes getCover_medium() {
        return cover_medium;
    }

    public void setCover_medium(DouYinUriAndUrlRes cover_medium) {
        this.cover_medium = cover_medium;
    }

    public DouYinUriAndUrlRes getCover_thumb() {
        return cover_thumb;
    }

    public void setCover_thumb(DouYinUriAndUrlRes cover_thumb) {
        this.cover_thumb = cover_thumb;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public DouYinUriAndUrlRes getCover_hd() {
        return cover_hd;
    }

    public void setCover_hd(DouYinUriAndUrlRes cover_hd) {
        this.cover_hd = cover_hd;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeMusicDetailRes{" +
                "title='" + title + '\'' +
                ", cover_large=" + cover_large +
                ", play_url=" + play_url +
                ", position=" + position +
                ", cover_medium=" + cover_medium +
                ", cover_thumb=" + cover_thumb +
                ", duration=" + duration +
                ", status=" + status +
                ", id=" + id +
                ", mid='" + mid + '\'' +
                ", author='" + author + '\'' +
                ", cover_hd=" + cover_hd +
                '}';
    }
}
