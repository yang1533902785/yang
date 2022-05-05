package com.tm.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    /**
     * 把拦截器工厂注入到ioc容器中
     */
    @Bean
    public TestGatewayFilterFactory gatewayFilterFactory(){
        return new TestGatewayFilterFactory();
    }
}
