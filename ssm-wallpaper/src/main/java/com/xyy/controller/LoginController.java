package com.xyy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 2025/5/20 21:00
 * 向远洋
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    //用户下载资源
    @GetMapping()
    public Result downloadImg(HttpSession session) {
        Object name = session.getAttribute("name");
        if(name == null) {
            return new Result(Code.UNLOGIN_STATUS, null, "请先登录！");
        }
        return new Result(Code.LOGIN_STATUS, null, "");
    }
}
