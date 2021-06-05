package com.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @LoadBalanced   //提供负载均衡能力，采用轮询机制
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}