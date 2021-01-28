package com.luwei.DouyinReptile.http;

import java.io.Serializable;

/***
 * 
 * @author zxx
 * @param <T>
 * 20181016
 */
public final class HttpRequest<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer pageNumber;
    private Integer pageSize;
    private T data;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CheckHttpRequest{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", data=" + data +
                '}';
    }
}