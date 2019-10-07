package part03autowired;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part01lifecycle.Car;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 9:40
 * @Author: code1990
 * @Description:
 */
public class AutowiredTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfig.class);

    @Test
    public void testAutowired() {

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        BookDao bean = applicationContext.getBean(BookDao.class);
        System.out.println(bean);

        System.out.println(applicationContext);
        applicationContext.close();
    }

    @Test
    public void testGetBookEntity() {
        BookEntity entity = (BookEntity) applicationContext.getBean("getBookEntity");
        System.out.println(entity);
        BookDao book = applicationContext.getBean(BookDao.class);
        System.out.println(book);

    }
}
