package com.llnqdx.spring.anno.cap6.config;
/**
 *
 */

import com.llnqdx.spring.anno.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class MarvinFactoryBean implements FactoryBean<Monkey> {
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    public Class<?> getObjectType() {
        return Monkey.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
