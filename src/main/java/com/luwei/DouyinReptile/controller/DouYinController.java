package com.luwei.DouyinReptile.controller;

import com.luwei.DouyinReptile.entity.res.topic.DouYinTopicDetailRes;
import com.luwei.DouyinReptile.enums.UrlEnums;
import com.luwei.DouyinReptile.http.HttpResponse;
import com.luwei.DouyinReptile.serivce.TopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 抖音爬虫相关接口
 */
@RestController
@RequestMapping("douyin")
public class DouYinController {

    private static final Logger logger = LoggerFactory.getLogger(DouYinController.class);

    @Autowired
    private TopicService topicService;

    /**
     * 获取抖音主题详情信息
     * @return
     */
    @RequestMapping("topic")
    public HttpResponse getTopicDetail(){
        DouYinTopicDetailRes result = topicService.getDouyinTopicDetailPageByHeadrs(UrlEnums.TopicUrl, null);
        logger.info("获取抖音主题详情信息请求结果：{}",result);
        return HttpResponse.success(result);
    }

    @RequestMapping("comment")
    public HttpResponse getCommentDetail(){

        return HttpResponse.success();
    }
}
