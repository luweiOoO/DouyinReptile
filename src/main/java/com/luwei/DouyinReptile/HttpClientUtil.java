package com.luwei.DouyinReptile;

import com.alibaba.fastjson.JSON;
import com.luwei.DouyinReptile.config.SSLClient;
import com.luwei.DouyinReptile.entity.res.topic.DouYinTopicDetailRes;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 利用HttpClient进行post请求的工具类
 * @ClassName: HttpClientUtil
 * @Description: TODO
 * @author Devin <xxx>
 * @date 2017年2月7日 下午1:43:38
 *
 */
public class HttpClientUtil {
    @SuppressWarnings("resource")
    public static String doPost(String url,String jsonstr,String charset){
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try{
            httpClient = new SSLClient();
            httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json");
            StringEntity se = new StringEntity(jsonstr);
            se.setContentType("text/json");
            se.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
            httpPost.setEntity(se);
            HttpResponse response = httpClient.execute(httpPost);
            if(response != null){
                HttpEntity resEntity = response.getEntity();
                if(resEntity != null){
                    result = EntityUtils.toString(resEntity,charset);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }


    public static InputStream doGet(String filename) {
        //创建HttpClient实例
        CloseableHttpClient httpClient = null;
        StringBuffer stringBuffer = new StringBuffer();
        //拼接get请求URL（url一般包含接口需要的用户名，密码，文件名等参数）
        String url = "https://www.iesdouyin.com/web/api/v2/challenge/aweme/?ch_id=1564935806054401&count=10&cursor=0&aid=1128&screen_limit=3&download_click_limit=0&_signature=dJMcPAAAFJ2cST5B38sjrHSTHC";

        InputStream inputStream = null;
        try {
            httpClient = new SSLClient();
            //创建get方法连接实例，在get方法中传入待连接地址
            HttpGet httpGet = new HttpGet(url);
            //发起请求，并返回请求响应
            HttpResponse httpResponse = httpClient.execute(httpGet);
            //得到响应实体
            HttpEntity entity = httpResponse.getEntity();
            //得到实体中文件
            inputStream = entity.getContent();

            BufferedReader streamReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();

            String inputStr;
            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);

            //Object parse = JSON.parse(responseStrBuilder.toString());
            DouYinTopicDetailRes parse = JSON.parseObject(responseStrBuilder.toString(),DouYinTopicDetailRes.class);

            long length = entity.getContentLength();
            if (length <= 0) {
                System.out.println("下载文件不存在！");
                return inputStream;
            }
            System.out.println("The response value of token:" + httpResponse.getFirstHeader("token"));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return inputStream;
    }


    public static void main(String[] args) {
        doGet("");
    }

}
