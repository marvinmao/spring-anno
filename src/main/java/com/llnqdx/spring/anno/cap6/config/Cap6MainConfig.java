package com.llnqdx.spring.anno.cap6.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap1.Marvin;
import com.llnqdx.spring.anno.cap6.bean.Cat;
import com.llnqdx.spring.anno.cap6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
//@Import({Dog.class, Cat.class,MarvinImportSelector.class,MarvinImportBeanDefinitionRegistrar.class})
//@Import({Dog.class})
@Import({Dog.class, Cat.class})
public class Cap6MainConfig {

    @Bean
    public Marvin marvin006() {
        System.out.println("add to the container  marvin006 ...");
        return new Marvin("marvin006", 6001, "13866666666");
    }

    @Bean
    public MarvinFactoryBean marvinFactoryBean() {
        return new MarvinFactoryBean();
    }
}
