package com.luwei.DouyinReptile.entity.res.topic;

import java.io.Serializable;
import java.util.List;

/**
 * 抖音主题数据-单个视频信息参数接收类
 */
public class DouYinTopicAwemeDetailRes implements Serializable {

    /**
     * 视频创建时间
     */
    private Long create_time;

    /**
     * 视频分类
     */
    private Integer aweme_type;

    private Object long_video;

    /**
     *
     */
    private Boolean is_live_replay;

    /**
     * 视频id
     */
    private Long aweme_id;

    /**
     * 作者用户id
     */
    private Long author_user_id;

    /**
     * 视频标签
     */
    private Object video_labels;

    /**
     *
     */
    private Object geofencing;

    /**
     *
     */
    private String forward_id;

    private Object label_top_text;

    /**
     * 分组id
     */
    private Long group_id;

    /**
     * 是否优先展示？
     */
    private Integer is_preview;

    /**
     * 评论列表
     */
    private List<Object> comment_list;

    private DouYinTopicAwemeTimerDetailRes timer;

    private Object images;

    /**
     * 视频描述
     */
    private String desc;

    /**
     * 分享链接
     */
    private String share_url;

    private List<DouYinTopicAwemeTextExtraDetailRes> text_extra;

    private Integer duration;

    private Object image_infos;



    private Object promotions;

    private Object video_text;

    private List<DouYinTopicAwemeChaDetailRes> cha_list;

    /**
     * 作者相关信息
     */
    private DouYinTopicAwemeAuthorDetailRes author;

    /**
     * 视频背景音乐相关信息
     */
    private DouYinTopicAwemeMusicDetailRes music;

    /**
     * 视频相关信息
     */
    private DouYinTopicAwemeVideoDetailRes Video;

    /**
     * 分享信息
     */
    private DouYinTopicAwemeShareInfoDetailRes share_info;

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Integer getAweme_type() {
        return aweme_type;
    }

    public void setAweme_type(Integer aweme_type) {
        this.aweme_type = aweme_type;
    }

    public Object getLong_video() {
        return long_video;
    }

    public void setLong_video(Object long_video) {
        this.long_video = long_video;
    }

    public Boolean getIs_live_replay() {
        return is_live_replay;
    }

    public void setIs_live_replay(Boolean is_live_replay) {
        this.is_live_replay = is_live_replay;
    }

    public Long getAweme_id() {
        return aweme_id;
    }

    public void setAweme_id(Long aweme_id) {
        this.aweme_id = aweme_id;
    }

    public Long getAuthor_user_id() {
        return author_user_id;
    }

    public void setAuthor_user_id(Long author_user_id) {
        this.author_user_id = author_user_id;
    }

    public Object getVideo_labels() {
        return video_labels;
    }

    public void setVideo_labels(Object video_labels) {
        this.video_labels = video_labels;
    }

    public Object getGeofencing() {
        return geofencing;
    }

    public void setGeofencing(Object geofencing) {
        this.geofencing = geofencing;
    }

    public String getForward_id() {
        return forward_id;
    }

    public void setForward_id(String forward_id) {
        this.forward_id = forward_id;
    }

    public Object getLabel_top_text() {
        return label_top_text;
    }

    public void setLabel_top_text(Object label_top_text) {
        this.label_top_text = label_top_text;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public Integer getIs_preview() {
        return is_preview;
    }

    public void setIs_preview(Integer is_preview) {
        this.is_preview = is_preview;
    }

    public List<Object> getComment_list() {
        return comment_list;
    }

    public void setComment_list(List<Object> comment_list) {
        this.comment_list = comment_list;
    }

    public DouYinTopicAwemeTimerDetailRes getTimer() {
        return timer;
    }

    public void setTimer(DouYinTopicAwemeTimerDetailRes timer) {
        this.timer = timer;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public List<DouYinTopicAwemeTextExtraDetailRes> getText_extra() {
        return text_extra;
    }

    public void setText_extra(List<DouYinTopicAwemeTextExtraDetailRes> text_extra) {
        this.text_extra = text_extra;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Object getImage_infos() {
        return image_infos;
    }

    public void setImage_infos(Object image_infos) {
        this.image_infos = image_infos;
    }

    public Object getPromotions() {
        return promotions;
    }

    public void setPromotions(Object promotions) {
        this.promotions = promotions;
    }

    public Object getVideo_text() {
        return video_text;
    }

    public void setVideo_text(Object video_text) {
        this.video_text = video_text;
    }

    public List<DouYinTopicAwemeChaDetailRes> getCha_list() {
        return cha_list;
    }

    public void setCha_list(List<DouYinTopicAwemeChaDetailRes> cha_list) {
        this.cha_list = cha_list;
    }

    public DouYinTopicAwemeAuthorDetailRes getAuthor() {
        return author;
    }

    public void setAuthor(DouYinTopicAwemeAuthorDetailRes author) {
        this.author = author;
    }

    public DouYinTopicAwemeMusicDetailRes getMusic() {
        return music;
    }

    public void setMusic(DouYinTopicAwemeMusicDetailRes music) {
        this.music = music;
    }

    public DouYinTopicAwemeVideoDetailRes getVideo() {
        return Video;
    }

    public void setVideo(DouYinTopicAwemeVideoDetailRes video) {
        Video = video;
    }

    public DouYinTopicAwemeShareInfoDetailRes getShare_info() {
        return share_info;
    }

    public void setShare_info(DouYinTopicAwemeShareInfoDetailRes share_info) {
        this.share_info = share_info;
    }

    @Override
    public String toString() {
        return "DouYinTopicAwemeDetailRes{" +
                "create_time=" + create_time +
                ", aweme_type=" + aweme_type +
                ", long_video=" + long_video +
                ", is_live_replay=" + is_live_replay +
                ", aweme_id=" + aweme_id +
                ", author_user_id=" + author_user_id +
                ", video_labels=" + video_labels +
                ", geofencing=" + geofencing +
                ", forward_id='" + forward_id + '\'' +
                ", label_top_text=" + label_top_text +
                ", group_id=" + group_id +
                ", is_preview=" + is_preview +
                ", comment_list=" + comment_list +
                ", timer=" + timer +
                ", images=" + images +
                ", desc='" + desc + '\'' +
                ", share_url='" + share_url + '\'' +
                ", text_extra=" + text_extra +
                ", duration=" + duration +
                ", image_infos=" + image_infos +
                ", promotions=" + promotions +
                ", video_text=" + video_text +
                ", cha_list=" + cha_list +
                ", author=" + author +
                ", music=" + music +
                ", Video=" + Video +
                ", share_info=" + share_info +
                '}';
    }
}
