package com.llnqdx.spring.anno.cap7.bean;
/**
 *
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @Description: Aware自动装配
 * <p>
 * 把Spring底层的组件可以注入到自定义的bean中,ApplicationContextAware是利用ApplicationContextAwareProcessor来处理的,
 * 其它XXXAware也类似, 都有相关的Processor来处理, 其实就是后置处理器来处理;
 * XXXAware---->功能使用了XXXProcessor来处理的, 这就是后置处理器的作用;
 * ApplicaitonContextAware--->ApplicationContextProcessor后置处理器来处理的
 */
@Component
public class Light implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    public void setBeanName(String name) {
        System.out.println("the current bean name is : " + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("introduction IOC applicationContext : " + applicationContext);
        this.applicationContext = applicationContext;
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String result = resolver.resolveStringValue("hello ${os.name}, please cal #{3 * 8}");
        System.out.println("cal string result is : " + result);
    }
}
