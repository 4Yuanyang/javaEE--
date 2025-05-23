package com.xyy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * 2025/5/16 21:21
 * 向远洋
 */
@MapperScan("com.xyy.mapper")
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.xyy.domain");
        ssfb.setMapperLocations((new PathMatchingResourcePatternResolver()
                .getResources("classpath:com/xyy/mapper/*.xml")));
        ssfb.setDataSource(dataSource);
        return ssfb;
    }
}
