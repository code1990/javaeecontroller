package part00componetregister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 17:32
 * @Author: code1990
 * @Description:
 */
@Configuration
public class LazyAnnotation {

    /*
     *
     *@Lazy:懒加载： 主要针对单例对象
     *
     * 		单实例bean：默认在容器启动的时候创建对象；
     *
     * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     */
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加Person....");
        return new Person("张三", 25);
    }
}
