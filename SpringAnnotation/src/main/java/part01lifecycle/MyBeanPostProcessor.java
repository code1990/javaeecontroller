package part01lifecycle;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 22:34
 * @Author: code1990
 * @Description:
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 后置处理器：初始化前后进行处理工作
 * 将后置处理器加入到容器中
 * <p>
 * 1.构造器构造对象
 * <p>
 * 2.BeanPostProcessor.postProcessBeforeInitialization
 * <p>
 * 3.初始化：对象创建完成，并赋值好，调用初始化方法。。。
 * <p>
 * 4.BeanPostProcessor.postProcessAfterInitialization
 * 5.销毁：
 *
 * BeanPostProcessor【interface】：bean的后置处理器；
 * 	在bean初始化前后进行一些处理工作；
 * 	postProcessBeforeInitialization:在初始化之前工作
 * 	postProcessAfterInitialization:在初始化之后工作
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..." + beanName + "=>" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..." + beanName + "=>" + bean);
        return bean;
    }

}

