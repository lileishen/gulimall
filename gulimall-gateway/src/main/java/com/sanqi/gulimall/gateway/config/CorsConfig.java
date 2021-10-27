package com.sanqi.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


/**
 * 允许跨域的配置类
 */
@Configuration
public class CorsConfig {
    @Bean
    public CorsWebFilter corsConfiguration(){
//        配置允许跨域的配置信息
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        return new CorsWebFilter(source);
    }
}
