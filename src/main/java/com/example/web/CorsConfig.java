package com.example.web;

import com.example.cors.properties.CorsProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableConfigurationProperties(CorsProperties.class)//<- 이번만..!
//@EnableConfigurationProperties("com.example")//
public class CorsConfig implements WebMvcConfigurer {

    private final CorsProperties corsPorperties;

    public CorsConfig(CorsProperties corsProperties ){
        this.corsPorperties = corsProperties;
    }


    // Ctrl + i -> CORS Mapping 관련 함수
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*") // *: asterisk, 기능적으로 "와일드 카드" 역할로 자주 사용됨
                .allowedMethods("*") // 공통(GET, PUT, POST, PATCH, DELETE, HEAD, TRACE) + 확장
                .allowedOrigins(
                        "http://localhost:3000",
                        "https://localhost:3000"
                )
                .allowCredentials(true)
                .exposedHeaders("*")
                .maxAge(3600L);
    }
}