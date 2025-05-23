package com.xyy.controller;

import com.xyy.domain.User;
import com.xyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * 2025/5/19 19:29
 * 向远洋
 */
@RestController
@RequestMapping("/users")
@EnableWebMvc
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/exists/{userName}")
    public Result checkUserExists(@PathVariable String userName) throws UnsupportedEncodingException {
        User u = userService.getByUserName(userName);
        if(u == null) {
            //数据库暂无此人
            return new Result(Code.NO_USER, null, "用户不存在，先注册！");
        }
        return new Result(Code.HAVE_USER, null, "");
    }
    @GetMapping("/{id}")
    public Result getUserById(@PathVariable int id) {
        User u = userService.getById(id);
        return new Result(Code.GET_USER_SUCCESS, u, "");
    }

    //登录
    @PostMapping("/checkAccount")
    public Result checkUserAccount(@RequestBody User user, HttpSession session) {
        User u = userService.getByUser(user);
        if(u == null) {
            //账户密码不匹配
            return new Result(Code.ERR_PSW, null, "用户密码不匹配！");
        }
        //登录成功，保存用户姓名到Session中
        System.out.println("登录保存账号和id----");
        System.out.println(u);
        System.out.println(u.getId());
        System.out.println(u.getUserName());
        session.setAttribute("id", u.getId());
        session.setAttribute("name", u.getUserName());
        System.out.println(session.getAttribute("id"));
        System.out.println(session.getAttribute("name"));
        return new Result(Code.RIGHT_PSW, null, "");
    }

    //注册新用户
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        userService.addUser(user);
        return new Result(Code.ADD_USER_SUCCESS, null, "");
    }

    //退出登录
    @GetMapping("/loginOut")
    public Result loginOut(HttpSession session) {
        //清空session
        session.invalidate();
        return new Result(Code.LOGIN_OUT_SUCCESS, null, "请清空用户数据！");
    }
}
