package com.llnqdx.spring.anno.cap1.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap1.Marvin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
@Configuration
public class MainConfig {

    @Bean("abcMarvin002")
    public Marvin marvin1002() {
        return new Marvin("bbb", 222, "13822222222");
    }
}
