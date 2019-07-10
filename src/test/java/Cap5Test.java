/**
 *
 */

import com.llnqdx.spring.anno.cap5.config.Cap5MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Cap5Test {

    @Test
    public void test05() {

        ApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);

        System.out.println("IOC container has been created ...");

    }
}
