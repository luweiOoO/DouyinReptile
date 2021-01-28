package com.luwei.DouyinReptile.entity.res.topic;

import java.io.Serializable;

public class DouYinTopicAwemeTextExtraDetailRes implements Serializable {

    private Integer start;

    private Integer end;

    private Integer type;

    private Long hashtag_id;

    private String hashtag_name;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getHashtag_id() {
        return hashtag_id;
    }

    public void setHashtag_id(Long hashtag_id) {
        this.hashtag_id = hashtag_id;
    }

    public String getHashtag_name() {
        return hashtag_name;
    }

    public void setHashtag_name(String hashtag_name) {
        this.hashtag_name = hashtag_name;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeTextExtraDetailRes{" +
                "start=" + start +
                ", end=" + end +
                ", type=" + type +
                ", hashtag_id=" + hashtag_id +
                ", hashtag_name='" + hashtag_name + '\'' +
                '}';
    }
}
