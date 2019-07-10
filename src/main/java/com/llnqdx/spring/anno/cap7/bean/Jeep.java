package com.llnqdx.spring.anno.cap7.bean;
/**
 *
 */

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 *
 * 使用JSR250规则定义的(java规范)两个注解来实现定义和销毁
 */
@Component
public class Jeep {

    public Jeep() {
        System.out.println("Jeep ... constructor ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("Jeep ... @PostConstructor ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Jeep ... @PreDestroy ...");
    }
}
