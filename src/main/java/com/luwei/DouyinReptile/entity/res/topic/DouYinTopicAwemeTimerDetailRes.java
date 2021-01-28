package com.luwei.DouyinReptile.entity.res.topic;

import java.io.Serializable;

public class DouYinTopicAwemeTimerDetailRes implements Serializable {

    private Integer status;

    private Long public_time;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getPublic_time() {
        return public_time;
    }

    public void setPublic_time(Long public_time) {
        this.public_time = public_time;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeTimerDetailRes{" +
                "status=" + status +
                ", public_time=" + public_time +
                '}';
    }
}
