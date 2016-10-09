package com.wang.controll;

import com.wang.interceptor.Check;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2016/10/7.
 */
public class BaseController extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //利用拦截器注册一个对象，给请求指定一个拦截的对象，并且指定拦截的路径。
    registry.addInterceptor(new Check()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
