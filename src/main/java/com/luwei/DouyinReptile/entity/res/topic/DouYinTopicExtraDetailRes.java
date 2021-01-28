package com.luwei.DouyinReptile.entity.res.topic;

import java.io.Serializable;

/**
 * 抖音话题详情-额外信息参数接收类
 */
public class DouYinTopicExtraDetailRes implements Serializable {

    /**
     * 请求接口时的时间戳(ms)
     */
    private Long now;

    /**
     * 日志id
     */
    private String logid;

    public Long getNow() {
        return now;
    }

    public void setNow(Long now) {
        this.now = now;
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid;
    }

    @Override
    public String toString() {
        return "DouYinTopicExtraDetailRes{" +
                "now=" + now +
                ", logid='" + logid + '\'' +
                '}';
    }
}
