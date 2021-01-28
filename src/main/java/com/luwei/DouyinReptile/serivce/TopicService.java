package com.luwei.DouyinReptile.serivce;

import com.luwei.DouyinReptile.entity.res.topic.DouYinTopicDetailRes;
import org.apache.http.message.BasicHeader;
import org.springframework.stereotype.Service;

/**
 * 抖音主题接口类
 */
public interface TopicService {

    /**
     * 调用抖音主题接口获取主题信息
     * @param url
     * @param httpHeaders
     * @return
     */
    DouYinTopicDetailRes getDouyinTopicDetailPageByHeadrs(String url, BasicHeader[] httpHeaders);
}
