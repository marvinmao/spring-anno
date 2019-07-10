package com.llnqdx.spring.anno.cap5.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap1.Marvin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Cap5MainConfig {

    @Bean
    public Marvin marvin005() {
        System.out.println("add to the container  marvin005 ...");
        return new Marvin("marvin005", 5001, "13855555555");
    }

    /**
     * IOC容器注册bean时,当操作系统为WINDOWS时,注册 zhangsan005 实例,此时要用得@Conditional注解进行定制化条件选择注册bean
     * 当引入@Conditional时, 容器可以选择性的注册bean
     */
    @Conditional({WindowsCondition.class})
    @Bean
    public Marvin zhangsan005() {
        System.out.println("add to the container  zhangsan005 ...");
        return new Marvin("zhangsan005", 5002, "13855555552");
    }


    /**
     * IOC容器注册bean时,当操作系统为LINUX时, 注册 lisi005 实例,此时要用得@Conditional注解进行定制化条件选择注册bean
     * 当引入@Conditional时, 容器可以选择性的注册bean
     */
    @Conditional({LinuxCondition.class})
    @Bean
    public Marvin lisi005() {
        System.out.println("add to the container  lisi005 ...");
        return new Marvin("lisi005", 5003, "13855555553");
    }
}
