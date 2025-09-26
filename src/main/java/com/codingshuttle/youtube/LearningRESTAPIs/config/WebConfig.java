package com.codingshuttle.youtube.LearningRESTAPIs.config;


import com.codingshuttle.youtube.LearningRESTAPIs.controller.CustomHTTPHeaderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//This class written to configure Interceptor of CustomHTTPHeaderInterceptor.java
//Register the interceptor by overriding the addInterceptors method of WebMvcConfigurer interface
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    CustomHTTPHeaderInterceptor customHTTPHeaderInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customHTTPHeaderInterceptor);
              /*  .addPathPatterns("/**") // Apply to all paths
                .excludePathPatterns("/public/**"); // Exclude specific paths if needed*/
    }

}
