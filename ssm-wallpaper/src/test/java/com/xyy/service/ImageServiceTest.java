/*
package com.xyy.service;

import com.xyy.config.SpringConfig;
import com.xyy.domain.Image;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

*/
/**
 * 2025/5/18 23:22
 * 向远洋
 *//*

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ImageServiceTest {
    @Autowired
    ImageService service;
    //上传图片测试
    @Test
    public void addImageTest() {
        Image image = new Image(null, "完美世界", "http://xxx", 999, "2022-01-19");
        System.out.println(service.addImage(image));
    }
    @Test
    public void getImageTest() {
        String url = "http://swg6gfdig.hn-bkt.clouddn.com/FtW1ruU1IIRuUT3k7T4U42zh63mi?e=1747669259&token=zLFxIwO5vDPmK_uYuQZTI6aLFo33HLAkUBFlOPMW:o-PpzF9WWlx504SSbFOsqjTScmI=";
        System.out.println(service.getImage(url));
    }
    @Test
    public void deleteImage() {
        String url = "http://xxx";
        System.out.println(service.deleteImage(url));
    }
    @Test
    public void getImagesByIndex(){
         int index = 1;
        System.out.println(service.getImageByIndex(index));
    }
}
*/
