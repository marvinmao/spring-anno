package com.llnqdx.spring.anno.cap10.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap10.aop.Calculator;
import com.llnqdx.spring.anno.cap10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @author:
 * @Date: 2019-7-11
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
