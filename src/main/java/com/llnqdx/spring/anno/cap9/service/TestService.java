package com.llnqdx.spring.anno.cap9.service;

import com.llnqdx.spring.anno.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 自动装配：
 *
 * @Autowired表示默认优先按类型去容器中找对应的组件,相当于anno.getBean(TestDao.class)去容器获取id为testDao的bean, 并注入到TestService的bean中
 * <p>
 * @Resource和Autowired一样可以装配bean
 * @Resource缺点: 不能支持@Primary功能
 * 不能支持@Autowired(required = false)的功能
 * <p>
 * @Inject和Autowired一样可以装配bean, 并支持@Primary功能, 可用于非spring框架.
 * @Inject缺点: 但不能支持@Autowired(required = false)的功能,需要引入第三方包javax.inject
 * <p>
 * @Autowired属于spring的, 不能脱离spring,  @Resource和@Inject都是JAVA规范
 * 推荐大家使用@Autowired
 */
@Service
public class TestService {
    //@Qualifier("testDao")
    @Autowired(required = false)
    //效果是一样的,与Autowired一样可以装配bean
    //1,不支持Primary功能
    //2,不支持Autowired false
    //@Resource(name="testDao2")
//    @Inject
    private TestDao testDao2;

    public void println() {
        System.out.println(testDao2);
    }
}
