package com.jlau.easyweb.config;

import com.jlau.easyweb.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LiangYuChao
 */
@Configuration
@Import({GlobalExceptionHandler.class, Knife4jConfig.class,})
public class MyAutoConfiguration {
}