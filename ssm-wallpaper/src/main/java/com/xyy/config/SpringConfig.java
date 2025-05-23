package com.xyy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * 2025/5/18 21:42
 * 向远洋
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan({"com.xyy.service"})
@Import({MybatisConfig.class, JdbcConfig.class})
public class SpringConfig {

}
