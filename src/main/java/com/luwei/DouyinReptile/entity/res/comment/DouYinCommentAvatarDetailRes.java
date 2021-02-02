package com.luwei.DouyinReptile.entity.res.comment;

import java.io.Serializable;
import java.util.List;

public class DouYinCommentAvatarDetailRes implements Serializable {


    private String uri;

    private List<String> url_list;

    private Integer width;

    private Integer height;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<String> getUrl_list() {
        return url_list;
    }

    public void setUrl_list(List<String> url_list) {
        this.url_list = url_list;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "DouYinCommentAvatarDetailRes{" +
                "uri='" + uri + '\'' +
                ", url_list=" + url_list +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
