package com.llnqdx.spring.anno.cap7.bean;
/**
 *
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
@Component
public class MarvinBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization ..." + beanName + "..." + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization ..." + beanName + "..." + bean);
        return bean;
    }

}
