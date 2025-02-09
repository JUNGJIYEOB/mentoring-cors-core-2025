package com.example.cors.properties.aloowed;

import org.springframework.boot.context.properties.*;

@ConfigurationPropertiesBinding
public record CorsAllowedProperties (
        String[] headers
        // enum도 매핑은 가능 -> HTTP method는 표준에서도 확장된 메소드 허용이므로 문자열
        ,String[] method
        ,String[] origins
        ,Boolean credentials
){

}
