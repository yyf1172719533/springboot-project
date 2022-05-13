package com.timain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.elasticsearch")
public class ElasticSearchProperties {

    private String host;

    private Integer port;
}
