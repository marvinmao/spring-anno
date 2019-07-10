package com.llnqdx.spring.anno.cap2.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap1.Marvin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 * <p>
 * //@ComponentScan value:指定要扫描的包
 * //excludeFilters = Filter[] 指定扫描的时候按照什么规则排除那些组件
 * //includeFilters = Filter[] 指定扫描的时候只需要包含哪些组件
 * //useDefaultFilters = false 默认是true,扫描所有组件，要改成false
 * //－－－－扫描规则如下
 * //FilterType.ANNOTATION：按照注解
 * //FilterType.ASSIGNABLE_TYPE：按照给定的类型；比如按BookService类型
 * //FilterType.ASPECTJ：使用ASPECTJ表达式
 * //FilterType.REGEX：使用正则指定
 * //FilterType.CUSTOM：使用自定义规则，自已写类，实现TypeFilter接口
 */
@Configuration
@ComponentScan(value = "com.llnqdx.spring.anno.cap2", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Repository.class})
}, useDefaultFilters = false)
public class Cap2MainConfig {

    @Bean("marvin2002")
    public Marvin marvin2002() {
        return new Marvin("ccc", 333, "13833333333");
    }
}
