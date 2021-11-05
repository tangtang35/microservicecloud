package com.tangtang.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean
{
    @Bean
    @LoadBalanced   //对ConfigBean进行新注解@LoadBalanced    获得Rest时加入Ribbon的配置
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}