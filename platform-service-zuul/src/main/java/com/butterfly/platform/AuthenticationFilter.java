package com.butterfly.platform;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * AuthenticationFilter
 * <p>
 * 具体实现可参照{@link ZuulFilter}其他子类的细节
 *
 * @author LeopoldL1an 2020/7/5
 */
@Component
public class AuthenticationFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(ProviderFallback.class);

    // 路由类型： pre route post error
    @Override
    public String filterType() {
        return "pre";
    }

    // 执行顺序，越小越优先
    @Override
    public int filterOrder() {
        return 10;
    }

    // 是否执行
    @Override
    public boolean shouldFilter() {
        return true;
    }

    // 过滤器具体操作
    @Override
    public Object run() throws ZuulException {
        // 执行过滤器时的请求上下文，对过滤器的执行结果，赋予到context中
        RequestContext context = RequestContext.getCurrentContext();
        // 过滤的请求
        HttpServletRequest request = context.getRequest();
        logger.info("--->>> TokenFilter {},{}", request.getMethod(), request.getRequestURL().toString());
        final String token = request.getParameter("token");
//        request.getParameterMap().remove("token");
        if(StringUtils.isBlank(token)) {
            context.setSendZuulResponse(false); // 不继续向下路由
            context.setResponseBody("token is empty");
            context.setResponseStatusCode(400);
            context.set("isSuccess", false);
        } else {
            context.setSendZuulResponse(true); // 继续向下路由
            context.setResponseStatusCode(200);
            context.set("isSuccess", true);
        }
        return null;
    }
}
