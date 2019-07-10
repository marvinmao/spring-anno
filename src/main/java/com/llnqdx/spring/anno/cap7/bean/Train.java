package com.llnqdx.spring.anno.cap7.bean;
/**
 *
 */

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
@Component
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println("Train ... constructor ...");
    }

    //定义初始化逻辑
    // 当我们的bean属性赋值和初始化完成时调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train ... afterPropertiesSet ...");
    }

    //定义销毁逻辑
    // 当我们bean销毁时,调用此方法
    @Override
    public void destroy() throws Exception {
        System.out.println("Train ... destroy ...");
    }
}
