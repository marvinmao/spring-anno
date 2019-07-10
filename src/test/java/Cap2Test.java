/**
 *
 */

import com.llnqdx.spring.anno.cap2.config.Cap2MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Cap2Test {

    @Test
    public void test2002() {

        ApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);

        String[] names = app.getBeanDefinitionNames();
        System.out.println("BeanDefinitionCount:" + app.getBeanDefinitionCount());
        for (String name : names) {
            System.out.println(name);
        }
    }
}
