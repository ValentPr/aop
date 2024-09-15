package com.example.aop.beans;

import com.example.aop.LogExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestBean {
    @Bean
    @LogExecutionTime
    public void init() {
        log.info("Hello!");
    }
}
