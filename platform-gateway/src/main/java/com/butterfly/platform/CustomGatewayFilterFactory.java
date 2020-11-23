package com.butterfly.platform;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
@Component
public class CustomGatewayFilterFactory extends AbstractNameValueGatewayFilterFactory {

    @Override
    public GatewayFilter apply(NameValueConfig config) {
        return (exchange, chain) ->{
            System.out.println("执行自定义过滤器 2222222");
            exchange.getResponse().getHeaders().add(config.getName(), config.getValue());
            return chain.filter(exchange);
        };
    }
}
