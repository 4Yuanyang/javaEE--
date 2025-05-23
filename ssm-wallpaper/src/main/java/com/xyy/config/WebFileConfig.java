package com.xyy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class WebFileConfig {
    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        // 设置最大上传大小 10MB
        resolver.setMaxUploadSize(10 * 1024 * 1024);
        // 设置默认编码
        resolver.setDefaultEncoding("UTF-8");
        return resolver;
    }
}