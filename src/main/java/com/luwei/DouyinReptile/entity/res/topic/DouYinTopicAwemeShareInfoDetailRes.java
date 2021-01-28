package com.luwei.DouyinReptile.entity.res.topic;

import java.io.Serializable;

/**
 * 抖音话题视频--分享相关参数类
 */
public class DouYinTopicAwemeShareInfoDetailRes implements Serializable {

    /**
     * 分享微博文字描述
     */
    private String share_weibo_desc;

    /**
     * 分享其他平台的文字描述
     */
    private String share_desc;

    /**
     * 分享标题
     */
    private String share_title;

    public String getShare_weibo_desc() {
        return share_weibo_desc;
    }

    public void setShare_weibo_desc(String share_weibo_desc) {
        this.share_weibo_desc = share_weibo_desc;
    }

    public String getShare_desc() {
        return share_desc;
    }

    public void setShare_desc(String share_desc) {
        this.share_desc = share_desc;
    }

    public String getShare_title() {
        return share_title;
    }

    public void setShare_title(String share_title) {
        this.share_title = share_title;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeShareInfoDetailRes{" +
                "share_weibo_desc='" + share_weibo_desc + '\'' +
                ", share_desc='" + share_desc + '\'' +
                ", share_title='" + share_title + '\'' +
                '}';
    }
}
