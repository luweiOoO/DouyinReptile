package com.luwei.DouyinReptile.entity.res.comment;

import java.io.Serializable;

public class DouYinCommentLogPdDetailRes implements Serializable {

    private String impr_id;

    public String getImpr_id() {
        return impr_id;
    }

    public void setImpr_id(String impr_id) {
        this.impr_id = impr_id;
    }

    @Override
    public String toString() {
        return "DouYinCommentLogPdDetailRes{" +
                "impr_id='" + impr_id + '\'' +
                '}';
    }
}
