package part01lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 22:21
 * @Author: code1990
 * @Description:
 */

/**
 * @PostConstruct：在bean创建完成并且属性赋值完成；来执行初始化方法
 * @PreDestroy：在容器销毁bean之前通知我们进行清理工作
 */
@Component
public class PostConstructPreDestroy {
    public PostConstructPreDestroy() {
        System.out.println("PostConstructPreDestroy constructor");
    }

    /*//对象创建并赋值之后调用*/
    @PostConstruct
    public void init() {
        System.out.println("PostConstructPreDestroy @PostConstruct");
    }

    //容器移除对象之前
    @PreDestroy
    public void destroy() {
        System.out.println("PostConstructPreDestroy @PreDestroy");
    }
}
