package com.luwei.DouyinReptile.entity.res.topic;

import com.luwei.DouyinReptile.entity.res.DouYinUriAndUrlRes;

import java.io.Serializable;

/**
 * 话题中视频-vide相关信息类
 */
public class DouYinTopicAwemeVideoDetailRes implements Serializable {

    private DouYinUriAndUrlRes origin_cover;

    /**
     * 视频画质
     */
    private String ratio;

    /**
     * 是否有水印
     */
    private Boolean has_watermark;

    /**
     * 视频持续时长
     */
    private Integer duration;

    /**
     * 视频展示长度
     */
    private Integer height;

    /**
     * 视频展示宽度
     */
    private Integer width;

    private DouYinUriAndUrlRes dynamic_cover;

    private Object bit_rate;

    private String vid;

    private DouYinUriAndUrlRes play_addr;

    private DouYinUriAndUrlRes cover;

    public DouYinUriAndUrlRes getOrigin_cover() {
        return origin_cover;
    }

    public void setOrigin_cover(DouYinUriAndUrlRes origin_cover) {
        this.origin_cover = origin_cover;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public Boolean getHas_watermark() {
        return has_watermark;
    }

    public void setHas_watermark(Boolean has_watermark) {
        this.has_watermark = has_watermark;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public DouYinUriAndUrlRes getDynamic_cover() {
        return dynamic_cover;
    }

    public void setDynamic_cover(DouYinUriAndUrlRes dynamic_cover) {
        this.dynamic_cover = dynamic_cover;
    }

    public Object getBit_rate() {
        return bit_rate;
    }

    public void setBit_rate(Object bit_rate) {
        this.bit_rate = bit_rate;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public DouYinUriAndUrlRes getPlay_addr() {
        return play_addr;
    }

    public void setPlay_addr(DouYinUriAndUrlRes play_addr) {
        this.play_addr = play_addr;
    }

    public DouYinUriAndUrlRes getCover() {
        return cover;
    }

    public void setCover(DouYinUriAndUrlRes cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeVideoDetailRes{" +
                "origin_cover=" + origin_cover +
                ", ratio='" + ratio + '\'' +
                ", has_watermark=" + has_watermark +
                ", duration=" + duration +
                ", height=" + height +
                ", width=" + width +
                ", dynamic_cover=" + dynamic_cover +
                ", bit_rate=" + bit_rate +
                ", vid='" + vid + '\'' +
                ", play_addr=" + play_addr +
                ", cover=" + cover +
                '}';
    }
}
