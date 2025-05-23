package com.xyy.controller;

/**
 * 2025/5/17 9:54
 * 向远洋
 */
public class Code {
    public static final int ADD_OK = 20010;
    public static final int ADD_ERR = 20011;
    public static final int DEL_OK = 20020;
    public static final int DEL_ERR = 20021;
    public static final int MOD_OK = 20030;
    public static final int MOD_ERR = 20031;
    public static final int GET_OK = 20040;
    public static final int GET_ERR = 20041;

    //用户登录提示code
    public static final int NO_USER = 40011;
    public static final int HAVE_USER = 40010;
    public static final int ERR_PSW = 40021;
    public static final int RIGHT_PSW = 40020;
    public static final int GET_USER_SUCCESS = 40030;
    public static final int GET_USER_FAILURE = 40031;
    public static final int ADD_USER_SUCCESS = 40040;
    public static final int ADD_USER_FAILURE = 40041;

    //壁纸获取提示code
    public static final int GET_IMG_SUCCESS = 40110;
    public static final int GET_IMG_FAILURE = 40111;
    
    //下载提示
    public static final int DOWNLOAD_SUCCESS = 40210;
    public static final int DOWNLOAD_FAILURE = 40211;

    //登录提示，和下载提示一样，之前写的懒得改了
    public static final int LOGIN_STATUS = 40210;
    public static final int UNLOGIN_STATUS = 40211;

    public static final int LOGIN_OUT_SUCCESS = 40310;

    public static final int SYS_ERR = 50001;
    public static final int BUSINESS_ERR = 50002;
    public static final int SYSTEM_TIMEOUT_ERR = 60002;
    public static final int SYSTEM_UNKNOW_ERR = 59999;
}
