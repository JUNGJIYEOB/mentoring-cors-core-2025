package com.example.cors.properties.exposed;

import org.springframework.boot.context.properties.*;

@ConfigurationPropertiesBinding
public record CorsExposedProperties(String[] headers) {
}
