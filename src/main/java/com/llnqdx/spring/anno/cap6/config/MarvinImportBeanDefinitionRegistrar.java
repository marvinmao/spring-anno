package com.llnqdx.spring.anno.cap6.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class MarvinImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        boolean bean1 = beanDefinitionRegistry.containsBeanDefinition("com.llnqdx.spring.anno.cap6.bean.Cat");
        boolean bean2 = beanDefinitionRegistry.containsBeanDefinition("com.llnqdx.spring.anno.cap6.bean.Dog");
        //如果Dog和Cat同时存在于我们IOC容器中,那么创建Pig类, 加入到容器
        //对于我们要注册的bean, 给bean进行封装
        if (bean1 && bean2) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Pig.class);
            beanDefinitionRegistry.registerBeanDefinition("pig", rootBeanDefinition);
        }

    }
}
