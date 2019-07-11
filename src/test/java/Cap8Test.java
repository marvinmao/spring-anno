import com.llnqdx.spring.anno.cap8.bean.Bird;
import com.llnqdx.spring.anno.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap8Test {
    @Test
    public void test08() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        //从容器中获取所有bean
        String[] names = app.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
        Bird bird = (Bird) app.getBean("bird");

        System.out.println(bird);
        System.out.println("IOC container has been created ...");


        ConfigurableEnvironment environment = app.getEnvironment();
        System.out.println("environment====" + environment.getProperty("bird.color"));
        app.close();


    }
}
