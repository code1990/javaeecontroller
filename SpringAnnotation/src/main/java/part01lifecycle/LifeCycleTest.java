package part01lifecycle;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 21:30
 * @Author: code1990
 * @Description:
 */
public class LifeCycleTest {

    @Test
    public void testBeanAnnotation() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanAnnotationLifeCycle.class);
        System.out.println("容器创建完成...");

        //applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }

    @Test
    public void testInitializingDisposableBean(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanAnnotationLifeCycle.class);
        System.out.println("容器创建完成...");

        //关闭容器
        applicationContext.close();
    }

    @Test
    public void testPostConstructPreDestroy(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanAnnotationLifeCycle.class);
        System.out.println("容器创建完成...");

        //关闭容器
        applicationContext.close();
    }
}
