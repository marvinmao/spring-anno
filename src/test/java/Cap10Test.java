import com.llnqdx.spring.anno.cap10.aop.Calculator;
import com.llnqdx.spring.anno.cap10.config.Cap10MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap10Test {
    @Test
    public void test10() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);

        //使用容器中的bean
        Calculator calculator = app.getBean(Calculator.class);
        System.out.println(calculator.div(4, 0));

        app.close();

    }
}
