package com.luwei.DouyinReptile.entity.res.comment;

import java.io.Serializable;

public class DouYinCommentExtraDetailRes implements Serializable {

    /**
     * 当前时间戳
     */
    private Long now;

    private Object fatal_item_ids;

    public Long getNow() {
        return now;
    }

    public void setNow(Long now) {
        this.now = now;
    }

    public Object getFatal_item_ids() {
        return fatal_item_ids;
    }

    public void setFatal_item_ids(Object fatal_item_ids) {
        this.fatal_item_ids = fatal_item_ids;
    }

    @Override
    public String toString() {
        return "DouYinCommentExtraDetailRes{" +
                "now=" + now +
                ", fatal_item_ids=" + fatal_item_ids +
                '}';
    }
}
