package com.tangtang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        //return new RandomRule();//Ribbon默认是轮询，我自定义为随机
        return new RandomRule_TT();//我自定义为每个机器被访问5次
    }
}
