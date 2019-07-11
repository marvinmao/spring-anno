import com.llnqdx.spring.anno.cap9.config.Cap9MainConfig;
import com.llnqdx.spring.anno.cap9.dao.TestDao;
import com.llnqdx.spring.anno.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
    @Test
    public void test09() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);

        TestService testService = app.getBean(TestService.class);
        testService.println();
        //直接从容器中获取TestDao, 和使用Autowired注解来取比较
        TestDao testDao = app.getBean(TestDao.class);
        System.out.println(testDao);

        app.close();

    }
}
