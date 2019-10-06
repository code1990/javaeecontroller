package part01lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 22:08
 * @Author: code1990
 * @Description:
 */
/*通过让Bean实现InitializingBean（定义初始化逻辑），
 * 				DisposableBean（定义销毁逻辑）;
 * */
@Component
public class InitializingBeanDisposableBean implements InitializingBean, DisposableBean {

    public InitializingBeanDisposableBean() {
        System.out.println("InitializingDisposableBean constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("InitializingDisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingDisposableBean afterPropertiesSet");
    }
}
