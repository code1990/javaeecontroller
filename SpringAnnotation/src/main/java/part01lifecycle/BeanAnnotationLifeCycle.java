package part01lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 21:29
 * @Author: code1990
 * @Description:
 */

/**
 * bean的生命周期：
 * bean创建---初始化----销毁的过程
 * 容器管理bean的生命周期；
 * 我们可以自定义初始化和销毁方法；容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法
 * <p>
 * 构造（对象创建）
 * 单实例：在容器启动的时候创建对象
 * 多实例：在每次获取的时候创建对象\
 * <p>
 * 1）、指定初始化和销毁方法；
 * 通过@Bean指定init-method和destroy-method；
 */
@ComponentScan("part01lifecycle")
@Configuration
public class BeanAnnotationLifeCycle {

    //@Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car getCar() {
        return new Car();
    }

}
