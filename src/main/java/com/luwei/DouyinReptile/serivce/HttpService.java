package com.luwei.DouyinReptile.serivce;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * 远程访问接口服务类
 */
public interface HttpService {
    /**
     * 发送请求获取请求结果并转换为流
     * @param httpGet
     * @param httpClient
     * @return
     */
    StringBuilder getResponseStream(HttpGet httpGet, CloseableHttpClient httpClient);
}
