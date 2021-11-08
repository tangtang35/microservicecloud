package com.tangtang.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced   //对ConfigBean进行新注解@LoadBalanced    获得Rest时加入Ribbon的配置
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 默认是轮询算法,可以在这设置其他内置算法
     * @return
     */
    /*@Bean
    public IRule myIRule(){
        return new RandomRule();    //用随机算法替换轮询算法，如果将其中一个生产者下线，依旧可以随机
        //return new RetryRule();    //先按照RoundRobinRule轮询的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
    }*/
}