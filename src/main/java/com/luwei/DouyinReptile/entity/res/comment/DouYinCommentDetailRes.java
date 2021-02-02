package com.luwei.DouyinReptile.entity.res.comment;

import java.io.Serializable;
import java.util.List;

/**
 * 抖音评论列表详情请求结果参数类
 */
public class DouYinCommentDetailRes implements Serializable {

    /**
     * 状态编码
     */
    private Integer status_code;

    /**
     * 评论列表
     */
    private List<Object> comments;

    /**
     * 评论条数
     */
    private Integer cursor;

    /**
     * 是否还有更多数据 1有 0没有
     */
    private Integer has_more;

    private Integer reply_style;

    /**
     *
     * 总评论条数
     */
    private Integer total;

    /**
     * 额外信息
     */
    private DouYinCommentExtraDetailRes extra;

    private DouYinCommentLogPdDetailRes log_pd;

    private Integer hotsoon_filtered_count;

    private Integer hotsoon_has_more;

    private String hotsoon_text;
}
