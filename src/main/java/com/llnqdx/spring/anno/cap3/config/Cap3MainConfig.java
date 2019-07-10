package com.llnqdx.spring.anno.cap3.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap1.Marvin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
@Configuration
public class Cap3MainConfig {

    /**
     * prototype: 多实例：IOC容器启动并不会去调用方法创建对象放在容器中，而是每次获取的时候才会调用方法创建对象,见test02
     * singleton: 单实例（默认）：IOC容器启动会调用方法创建对象放到IOC容器中,以后每交获取就是直接从容器（理解成从map.get对象）中拿
     * request:  主要针对WEB应用，同一次请求创建一个实例
     * session:  同一个session创建一个实例（后面两个用得不多，了解即可）
     */
    @Scope("prototype")
    @Bean("marvin3001")
    public Marvin marvin3001() {
        return new Marvin("ccccccc", 3001, "13833331111");
    }
}
