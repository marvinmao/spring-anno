/**
 *
 */

import com.llnqdx.spring.anno.cap3.config.Cap3MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Cap3Test {

    @Test
    public void test03() {

        ApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);

        String[] names = app.getBeanDefinitionNames();
        System.out.println("BeanDefinitionCount:" + app.getBeanDefinitionCount());
        for (String name : names) {
            System.out.println(name);
        }

        Object bean1 = app.getBean("marvin3001");
        Object bean2 = app.getBean("marvin3001");
        System.out.println(bean1 == bean2);

    }
}
