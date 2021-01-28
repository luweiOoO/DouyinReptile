package com.luwei.DouyinReptile.config;

import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfig {

    private static Logger logger = LoggerFactory.getLogger(HttpClientConfig.class);

    /**
     * 构造httpClient
     * @return
     */
    @Bean
    public CloseableHttpClient httpClient(){
        CloseableHttpClient httpClient = null;
        try {
            httpClient = new SSLClient();
        }catch (Exception e){
            logger.info("构造httpClient异常:{}",e);
        }
        return httpClient;
    }

}
