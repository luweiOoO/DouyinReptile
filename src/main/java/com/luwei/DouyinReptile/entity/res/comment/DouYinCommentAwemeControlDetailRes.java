package com.luwei.DouyinReptile.entity.res.comment;

import java.io.Serializable;

public class DouYinCommentAwemeControlDetailRes implements Serializable {

    private Boolean can_forward;

    private Boolean can_share;

    private Boolean can_comment;

    private Boolean can_show_comment;

    public Boolean getCan_forward() {
        return can_forward;
    }

    public void setCan_forward(Boolean can_forward) {
        this.can_forward = can_forward;
    }

    public Boolean getCan_share() {
        return can_share;
    }

    public void setCan_share(Boolean can_share) {
        this.can_share = can_share;
    }

    public Boolean getCan_comment() {
        return can_comment;
    }

    public void setCan_comment(Boolean can_comment) {
        this.can_comment = can_comment;
    }

    public Boolean getCan_show_comment() {
        return can_show_comment;
    }

    public void setCan_show_comment(Boolean can_show_comment) {
        this.can_show_comment = can_show_comment;
    }

    @Override
    public String toString() {
        return "DouYinCommentAwemeControlDetailRes{" +
                "can_forward=" + can_forward +
                ", can_share=" + can_share +
                ", can_comment=" + can_comment +
                ", can_show_comment=" + can_show_comment +
                '}';
    }
}
