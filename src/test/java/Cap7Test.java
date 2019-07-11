/**
 *
 */

import com.llnqdx.spring.anno.cap7.config.Cap7MainConfigOfKLifeCycle;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Cap7Test {

    @Test
    public void test07() {

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigOfKLifeCycle.class);

        System.out.println("IOC container has been created ...");

        app.close();

    }
}
