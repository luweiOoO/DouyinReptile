package com.luwei.DouyinReptile.entity.res.topic;

import java.io.Serializable;
import java.util.List;

/**
 * 抖音话题详情参数接收类
 */
public class DouYinTopicDetailRes implements Serializable {
    /**
     * 是否还有更多数据
     */
    private Boolean has_more;

    /**
     * 额外信息
     */
    private DouYinTopicExtraDetailRes extra;

    /**
     * 未知
     */
    private Integer status_code;

    /**
     * 话题下视频信息列表
     */
    private List<DouYinTopicAwemeDetailRes> aweme_list;

    /**
     * 未知
     */
    private Integer cursor;

    public Boolean getHas_more() {
        return has_more;
    }

    public void setHas_more(Boolean has_more) {
        this.has_more = has_more;
    }

    public DouYinTopicExtraDetailRes getExtra() {
        return extra;
    }

    public void setExtra(DouYinTopicExtraDetailRes extra) {
        this.extra = extra;
    }

    public Integer getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }

    public List<DouYinTopicAwemeDetailRes> getAweme_list() {
        return aweme_list;
    }

    public void setAweme_list(List<DouYinTopicAwemeDetailRes> aweme_list) {
        this.aweme_list = aweme_list;
    }

    public Integer getCursor() {
        return cursor;
    }

    public void setCursor(Integer cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return "DouYinTopicDetailRes{" +
                "has_more=" + has_more +
                ", extra=" + extra +
                ", status_code=" + status_code +
                ", aweme_list=" + aweme_list +
                ", cursor=" + cursor +
                '}';
    }
}
