package com.xyy.controller;

import com.xyy.domain.Image;
import com.xyy.service.ImageService;
import com.xyy.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2025/5/20 22:30
 * 向远洋
 */
@RestController
@EnableWebMvc
@RequestMapping("/upload")
public class UploadController {
    @Autowired
    ImageService imageService;
    @RequestMapping("/img")
    public String uploadImg(@RequestParam("image") MultipartFile image, @RequestParam("head") String head, HttpSession session) {
        System.out.println("addImg ---------------");
        System.out.println(head);
        String upload = UploadUtil.upload(image);
        System.out.println(upload);
        Object id = session.getAttribute("id");
        System.out.println("session-id:" + id);
        String createTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(createTime);
        Image img = new Image(null, head, upload, (int)id, createTime);
        imageService.addImage(img);
        return upload;
    }
}
