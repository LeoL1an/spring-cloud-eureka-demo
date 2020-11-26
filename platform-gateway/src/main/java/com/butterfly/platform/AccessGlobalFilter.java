package com.butterfly.platform;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

//@Component // 启用
public class AccessGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token = exchange.getRequest().getHeaders().getFirst("token");
        if (StringUtils.isBlank(token)) {
            ServerHttpResponse response = exchange.getResponse();
//            response.getHeaders().add("Content-Type", "application/json;charset=utf-8");
            response.getHeaders().add("Content-Type", "text/plain");
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            DataBuffer buffer = response.bufferFactory().wrap("未授权".getBytes());
//            return response.writeWith(Flux.just(buffer));
            return response.writeWith(Mono.just(buffer));
        } else {
            // TODO 认证 token
        }
        System.out.println("认证成功");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
