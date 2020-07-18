#### 各项目下使用到的框架,方便查看

本项目只引用相关框架而已，最简单的样例


###### platform-config-server
- spring cloud config服务端
- eureka服务端、gitee
###### platform-consumer
- eureka客户端
- openfeign（ribbon、hystrix）
- spring cloud config客户端
- zipkin消息追踪
###### platform-consumer-consul
- consul客户端
###### platform-eureka
- eureka服务端
###### platform-provider
- 普通web项目
- spring cloud config客户端
- zipkin消息追踪 
###### platform-provider-consul
- consul客户端
###### platform-service-zuul
- zuul服务网关
- spring cloud config客户端
- zipkin消息追踪