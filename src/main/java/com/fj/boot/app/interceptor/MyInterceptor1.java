package com.fj.boot.app.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyInterceptor1 implements HandlerInterceptor {
	private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        _logger.info("this is MyInterceptor1 preHandle");
        // 只有返回true才会继续向下执行，返回false取消当前请求
//        String name = httpServletRequest.getParameter("name");
//        System.out.println("age: " + name);
//        
//        InputStreamReader reader = new InputStreamReader(httpServletRequest.getInputStream());
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String content = "";
//        StringBuilder builder = new StringBuilder("");
//        while ((content = bufferedReader.readLine()) != null) {
//        	builder.append(content);
//        }
//        System.out.println("stream：" + builder.toString());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        _logger.info("this is MyInterceptor1 postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        _logger.info("this is MyInterceptor1 afterCompletion");
    }
}
