package com.luwei.DouyinReptile.serivce.Impl;

import com.luwei.DouyinReptile.serivce.HttpService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 远程访问接口服务实现类
 */
@Service
public class HttpServiceImpl implements HttpService {

    private static final Logger logger = LoggerFactory.getLogger(HttpServiceImpl.class);

    @Override
    public StringBuilder getResponseStream(HttpGet httpGet, CloseableHttpClient httpClient) {


        InputStream inputStream = null;
        StringBuilder responseStrBuilder = null;
        try{
            //发起请求，并返回请求响应
            HttpResponse httpResponse = httpClient.execute(httpGet);
            //得到响应实体
            HttpEntity entity = httpResponse.getEntity();
            //得到实体中文件
            inputStream = entity.getContent();

            BufferedReader streamReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            responseStrBuilder = new StringBuilder();

            String inputStr;
            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);
        }catch (Exception e){
            logger.info("调用远程接口异常：{}",e);
        }
        return responseStrBuilder;
    }
}
