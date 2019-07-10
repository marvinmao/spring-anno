/**
 *
 */

import com.llnqdx.spring.anno.cap6.config.Cap6MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Cap6Test {

    @Test
    public void test06() {

        ApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);

        System.out.println("IOC container has been created ...");

        Object bean1 = app.getBean("marvinFactoryBean");
        System.out.println("bean1 type:" + bean1.getClass());
        Object bean2 = app.getBean("marvinFactoryBean");
        System.out.println("bean2 type:" + bean2.getClass());
        System.out.println(bean1 == bean2);

        Object bean3 = app.getBean("&marvinFactoryBean");

        System.out.println(app.getBeanDefinitionCount());
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }
}
