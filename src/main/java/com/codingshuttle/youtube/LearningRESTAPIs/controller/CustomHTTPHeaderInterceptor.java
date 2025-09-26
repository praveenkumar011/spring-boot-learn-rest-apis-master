package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class CustomHTTPHeaderInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("Inside CustomeHTTPHeaderInterceptor");
        String headerValue = request.getHeader("Key1");
      /*  if (headerValue == null || !headerValue.equals("ExpectedValue")) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Missing or invalid Key1");
            return false;
        }*/
        return true;
    }
}
