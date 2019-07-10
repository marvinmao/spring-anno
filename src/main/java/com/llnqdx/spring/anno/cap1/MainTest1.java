package com.llnqdx.spring.anno.cap1;
/**
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class MainTest1 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");

        Marvin marvin = (Marvin) app.getBean("marvin01");

        System.out.println(marvin);
    }
}
