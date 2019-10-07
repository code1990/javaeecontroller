package part06transcational;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 17:19
 * @Author: code1990
 * @Description:
 */
public class TransactionalTest {

    @Test
    public void testTransactional(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TransactionalConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);

        userService.insertUser();
        applicationContext.close();
    }
}
