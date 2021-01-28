package com.luwei.DouyinReptile.serivce.Impl;

import com.alibaba.fastjson.JSON;
import com.luwei.DouyinReptile.config.HttpClientConfig;
import com.luwei.DouyinReptile.entity.res.topic.DouYinTopicDetailRes;
import com.luwei.DouyinReptile.serivce.HttpService;
import com.luwei.DouyinReptile.serivce.TopicService;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class TopicServiceImpl implements TopicService {

    private static Logger logger = LoggerFactory.getLogger(TopicServiceImpl.class);

    @Autowired
    private CloseableHttpClient httpClient;

    @Autowired
    private HttpService httpService;

    @Override
    public DouYinTopicDetailRes getDouyinTopicDetailPageByHeadrs(String url, BasicHeader[] Headers) {
        //构建请求头等信息
        HttpGet httpGet = new HttpGet(url);
        if(Headers != null && Headers.length > 0){
            httpGet.setHeaders(Headers);
        }
        //发起请求获取请求内容流信息
        StringBuilder responseStrBuilder = httpService.getResponseStream(httpGet, httpClient);
        //将流信息进行转换成指定对象
        DouYinTopicDetailRes parse = JSON.parseObject(responseStrBuilder.toString(),DouYinTopicDetailRes.class);
        return parse;
    }
}
