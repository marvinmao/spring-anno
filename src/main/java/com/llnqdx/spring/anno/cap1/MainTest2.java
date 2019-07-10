package com.llnqdx.spring.anno.cap1;
/**
 *
 */

import com.alibaba.fastjson.JSON;
import com.llnqdx.spring.anno.cap1.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class MainTest2 {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] names = app.getBeanNamesForType(Marvin.class);

        System.out.println(JSON.toJSONString(names));

    }
}
