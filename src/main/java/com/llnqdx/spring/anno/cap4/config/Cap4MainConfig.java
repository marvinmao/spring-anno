package com.llnqdx.spring.anno.cap4.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap1.Marvin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
@Configuration
public class Cap4MainConfig {

    /**
     * 不加@Lazy注解，执行结果：
     * add to the container marvin ...
     * IOC container has been created ...
     * <p>
     * 加上@Lazy注解，执行结果：
     * IOC container has been created ...
     * add to the container marvin ...
     * <p>
     * 结论：
     * 加入@Lazy时(懒加载或称延时加载),只有获取anno.getBean(即第一次调用)时，才会加载到IOC容器中
     *
     * @Lazy注解注解的作用主要是：减少springIOC容器启动的加载时间
     */
    @Bean
    @Lazy
    public Marvin marvin4001() {
        System.out.println("add to the container marvin ...");
        return new Marvin("dddd", 4001, "13844444444");
    }
}
