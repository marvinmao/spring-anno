package com.llnqdx.spring.anno.cap9.config;

import com.llnqdx.spring.anno.cap9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.llnqdx.spring.anno.cap9.controller", "com.llnqdx.spring.anno.cap9.service", "com.llnqdx.spring.anno.cap9.dao"})
public class Cap9MainConfig {
    //spring进行自装配的时候默认首选的bean
    //@Primary
    @Bean("testDao")
    public TestDao testDao() {
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}
