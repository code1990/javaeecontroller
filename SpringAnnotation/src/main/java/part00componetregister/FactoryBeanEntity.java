package part00componetregister;

import org.springframework.beans.factory.FactoryBean;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 21:05
 * @Author: code1990
 * @Description:
 */
//创建一个Spring定义的FactoryBean
public class FactoryBeanEntity implements FactoryBean<ImportEntity> {
    //返回一个ImportEntity对象，这个对象会添加到容器中
    @Override
    public ImportEntity getObject() throws Exception {
        System.out.println("FactoryBeanEntity...getObject...");
        return new ImportEntity();
    }

    @Override
    public Class<?> getObjectType() {
        return ImportEntity.class;
    }

    //是单例？
    //true：这个bean是单实例，在容器中保存一份
    //false：多实例，每次获取都会创建一个新的bean；
    @Override
    public boolean isSingleton() {
        return false;
    }
}
