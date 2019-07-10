package com.llnqdx.spring.anno.cap7.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap1.Marvin;
import com.llnqdx.spring.anno.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 * <p>
 * bean的生命周期为bean的创建, 初始化, 当容器关闭时对单实例的bean进行销毁
 */
@Component
@ComponentScan("com.llnqdx.spring.anno.cap7.bean")
public class Cap7MainConfigOfKLifeCycle {

    @Bean
    public Marvin marvin007() {
        System.out.println("add to the container marvin007 ...");
        return new Marvin("marvin007", 7001, "13877777777");
    }

    /**
     * 单实例：
     * Jeep ... constructor ...
     * postProcessBeforeInitialization ...jeep...com.llnqdx.spring.anno.cap7.bean.Jeep@33c911a1
     * Jeep ... @PostConstructor ...
     * postProcessAfterInitialization ...jeep...com.llnqdx.spring.anno.cap7.bean.Jeep@33c911a1
     * Train ... constructor ...
     * postProcessBeforeInitialization ...train...com.llnqdx.spring.anno.cap7.bean.Train@1190200a
     * Train ... afterPropertiesSet ...
     * postProcessAfterInitialization ...train...com.llnqdx.spring.anno.cap7.bean.Train@1190200a
     * add to the container marvin007 ...
     * postProcessBeforeInitialization ...marvin007...Marvin{name='marvin007', age=7001, phone='13877777777'}
     * postProcessAfterInitialization ...marvin007...Marvin{name='marvin007', age=7001, phone='13877777777'}
     * Bike constructor ......
     * postProcessBeforeInitialization ...bike...com.llnqdx.spring.anno.cap7.bean.Bike@7ee8290b
     * Bike init ......
     * postProcessAfterInitialization ...bike...com.llnqdx.spring.anno.cap7.bean.Bike@7ee8290b
     * IOC container has been created ...
     * <p>
     * Bike destroy ......
     * Train ... destroy ...
     * Jeep ... @PreDestroy ...
     * <p>
     * <p>
     * 多实例：
     * Jeep ... constructor ...
     * postProcessBeforeInitialization ...jeep...com.llnqdx.spring.anno.cap7.bean.Jeep@707194ba
     * Jeep ... @PostConstructor ...
     * postProcessAfterInitialization ...jeep...com.llnqdx.spring.anno.cap7.bean.Jeep@707194ba
     * Train ... constructor ...
     * postProcessBeforeInitialization ...train...com.llnqdx.spring.anno.cap7.bean.Train@45b4c3a9
     * Train ... afterPropertiesSet ...
     * postProcessAfterInitialization ...train...com.llnqdx.spring.anno.cap7.bean.Train@45b4c3a9
     * add to the container marvin007 ...
     * postProcessBeforeInitialization ...marvin007...Marvin{name='marvin007', age=7001, phone='13877777777'}
     * postProcessAfterInitialization ...marvin007...Marvin{name='marvin007', age=7001, phone='13877777777'}
     * <p>
     * IOC container has been created ...
     * Train ... destroy ...
     * Jeep ... @PreDestroy ...
     * <p>
     * <p>
     * <p>
     * 结论：
     * 单实例: 当容器关闭的时候,会调用destroy销毁
     * 多实例: 容器只负责初始化,但不会管理bean, 容器关闭不会调用销毁方法
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
//    @Scope("prototype")
    public Bike bike() {
        return new Bike();
    }
}
