/**
 *
 */

import com.llnqdx.spring.anno.cap4.config.Cap4MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Cap4Test {

    @Test
    public void test04() {

        ApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);

        System.out.println("IOC container has been created ...");

        app.getBean("marvin4001");

    }
}
