package com.llnqdx.spring.anno.cap7.bean;
/**
 *
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 *
 */
@Component
public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Plane() {
        System.out.println("Plane ... constructor ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("Plane ... @PostConstructor ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Plane ... @PreDestroy ...");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("introduction IOC applicationContext : " + applicationContext);
        this.applicationContext = applicationContext;
    }
}
