package part01lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 6:37
 * @Author: code1990
 * @Description:
 */
@Component
/*如果一个对象需要在运行时使用ioc容器 可以implements ApplicationContextAware来获取该ioc容器*/
public class ApplicationContextAwareBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
