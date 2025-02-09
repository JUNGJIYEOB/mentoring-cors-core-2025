package com.example.cors.properties;


import com.example.cors.properties.aloowed.CorsAllowedProperties;
import com.example.cors.properties.exposed.CorsExposedProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("com.webmvc.cors")
@ConfigurationPropertiesBinding
public record CorsProperties (
        @NestedConfigurationProperty CorsAllowedProperties allowed
        , @NestedConfigurationProperty CorsExposedProperties exposed
        , Long   maxAge
){


}
