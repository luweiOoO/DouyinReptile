package com.luwei.DouyinReptile.entity.res.comment;

import java.io.Serializable;
import java.util.List;

/**
 * 抖音单条评论内容参数类
 */
public class DouYinCommentContentDetailRes implements Serializable {

    private String cid;

    /**
     * 评论内容
     */
    private String text;

    /**
     * 视频id
     */
    private String aweme_id;

    /**
     * 评论时间
     */
    private Long create_time;

    /**
     * 评论点赞数
     */
    private Long digg_count;

    private Integer status;

    /**
     * 用户信息
     */
    private DouYinCommentUserDetailRes user;

    private String reply_id;

    private Integer user_digged;

    private Object reply_comment;

    private List<Object> text_extra;

    private String label_text;

    private Integer label_type;

    /**
     * 评论回复总条数
     */
    private Integer reply_comment_total;

    private String reply_to_reply_id;

    private Boolean is_author_digged;

    private Integer stick_position;

    private Boolean user_buried;

    private Object label_list;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAweme_id() {
        return aweme_id;
    }

    public void setAweme_id(String aweme_id) {
        this.aweme_id = aweme_id;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getDigg_count() {
        return digg_count;
    }

    public void setDigg_count(Long digg_count) {
        this.digg_count = digg_count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DouYinCommentUserDetailRes getUser() {
        return user;
    }

    public void setUser(DouYinCommentUserDetailRes user) {
        this.user = user;
    }

    public String getReply_id() {
        return reply_id;
    }

    public void setReply_id(String reply_id) {
        this.reply_id = reply_id;
    }

    public Integer getUser_digged() {
        return user_digged;
    }

    public void setUser_digged(Integer user_digged) {
        this.user_digged = user_digged;
    }

    public Object getReply_comment() {
        return reply_comment;
    }

    public void setReply_comment(Object reply_comment) {
        this.reply_comment = reply_comment;
    }

    public List<Object> getText_extra() {
        return text_extra;
    }

    public void setText_extra(List<Object> text_extra) {
        this.text_extra = text_extra;
    }

    public String getLabel_text() {
        return label_text;
    }

    public void setLabel_text(String label_text) {
        this.label_text = label_text;
    }

    public Integer getLabel_type() {
        return label_type;
    }

    public void setLabel_type(Integer label_type) {
        this.label_type = label_type;
    }

    public Integer getReply_comment_total() {
        return reply_comment_total;
    }

    public void setReply_comment_total(Integer reply_comment_total) {
        this.reply_comment_total = reply_comment_total;
    }

    public String getReply_to_reply_id() {
        return reply_to_reply_id;
    }

    public void setReply_to_reply_id(String reply_to_reply_id) {
        this.reply_to_reply_id = reply_to_reply_id;
    }

    public Boolean getIs_author_digged() {
        return is_author_digged;
    }

    public void setIs_author_digged(Boolean is_author_digged) {
        this.is_author_digged = is_author_digged;
    }

    public Integer getStick_position() {
        return stick_position;
    }

    public void setStick_position(Integer stick_position) {
        this.stick_position = stick_position;
    }

    public Boolean getUser_buried() {
        return user_buried;
    }

    public void setUser_buried(Boolean user_buried) {
        this.user_buried = user_buried;
    }

    public Object getLabel_list() {
        return label_list;
    }

    public void setLabel_list(Object label_list) {
        this.label_list = label_list;
    }

    @Override
    public String toString() {
        return "DouYinCommentContentDetailRes{" +
                "cid='" + cid + '\'' +
                ", text='" + text + '\'' +
                ", aweme_id='" + aweme_id + '\'' +
                ", create_time=" + create_time +
                ", digg_count=" + digg_count +
                ", status=" + status +
                ", user=" + user +
                ", reply_id='" + reply_id + '\'' +
                ", user_digged=" + user_digged +
                ", reply_comment=" + reply_comment +
                ", text_extra=" + text_extra +
                ", label_text='" + label_text + '\'' +
                ", label_type=" + label_type +
                ", reply_comment_total=" + reply_comment_total +
                ", reply_to_reply_id='" + reply_to_reply_id + '\'' +
                ", is_author_digged=" + is_author_digged +
                ", stick_position=" + stick_position +
                ", user_buried=" + user_buried +
                ", label_list=" + label_list +
                '}';
    }
}
