
服务网关注册到eureka后，可通过：http://zuulhost:zuulport/instanceId/** 进行转发访问

相同instanceId进行会负载均衡

例如：
```http request
localhost:9595/platform-provider/hello?name=22222222
```

### zuul filter
继承ZuulFilter类；
- filterType： filter类型
- filterOrder： filter执行顺序
- shouldFilter: filter是否生效
- run: filter具体操作

###### 禁用执行的filter
```yaml
zuul:
	FormBodyWrapperFilter:
		pre:
			disable: true
```

### fallback
实现FallbackProvider借口：
- getRoute: 指定服务降级的服务名
- fallbackResponse: 降级之后返回给客户端的响应 
