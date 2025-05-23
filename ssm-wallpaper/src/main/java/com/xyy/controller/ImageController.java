package com.xyy.controller;

import com.xyy.domain.Image;
import com.xyy.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 2025/5/19 21:40
 * 向远洋
 */
@RestController
@EnableWebMvc
@RequestMapping("/images")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @GetMapping("/{id}")
    public Result getImageFrom(@PathVariable int id, HttpSession session) {
        List<String> urls = imageService.getImageByIndex(id);
        Object name = session.getAttribute("name");
        return new Result(Code.GET_IMG_SUCCESS, urls, (name == null ? "用户":(String)name));
    }
//    @GetMapping()
    @PostMapping()
    public Result getImageByUrl(String url) {
        Image image = imageService.getImage(url);
//        System.out.println(image);
        return new Result(Code.GET_IMG_SUCCESS, image, "");
    }
}
