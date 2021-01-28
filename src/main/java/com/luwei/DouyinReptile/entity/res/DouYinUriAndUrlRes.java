package com.luwei.DouyinReptile.entity.res;

import java.io.Serializable;
import java.util.List;

/**
 * uri和url参数类
 */
public class DouYinUriAndUrlRes implements Serializable {

    /**
     * uri链接
     */
    private String uri;

    /**
     * url链接list
     */
    private List<String> url_list;

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

    @Override
    public String toString() {
        return "DouYinUriAndUrlRes{" +
                "uri='" + uri + '\'' +
                ", url_list=" + url_list +
                '}';
    }
}
