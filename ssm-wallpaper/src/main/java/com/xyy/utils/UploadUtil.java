package com.xyy.utils;


import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 2025/5/18 17:00
 * 向远洋
 */
public class UploadUtil {
    public static String upload(MultipartFile multipartFile) {
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.region2());
        System.out.println(1);
        cfg.resumableUploadAPIVersion = Configuration.ResumableUploadAPIVersion.V2;// 指定分片上传版本
        //...其他参数参考类注释
        System.out.println(2);
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        System.out.println(3);
        String accessKey = "zLFxIwO5vDPmK_uYuQZTI6aLFo33HLAkUBFlOPMW";
        String secretKey = "5RVdbxIWs7xPsMnKZKMW1TpdaszGlhBBu9gztLWx";
        String bucket = "wallpaperimgs";
        System.out.println(4);
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = null;

        //            byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
        Auth auth = Auth.create(accessKey, secretKey);
        System.out.println(5);
        String upToken = auth.uploadToken(bucket);
        System.out.println(6);

        try {
            Response response = uploadManager.put(multipartFile.getBytes(), key, upToken);
            System.out.println(7);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(8);
            System.out.println(9);
            return "http://swg6gfdig.hn-bkt.clouddn.com/" + putRet.key;
        } catch (QiniuException ex) {
            ex.printStackTrace();
            if (ex.response != null) {
                System.err.println(ex.response);

                try {
                    String body = ex.response.toString();
                    System.err.println(body);
                } catch (Exception ignored) {
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

}
