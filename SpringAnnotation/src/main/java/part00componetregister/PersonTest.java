package part00componetregister;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 16:31
 * @Author: code1990
 * @Description:
 */
public class PersonTest {
    AnnotationConfigApplicationContext conditionalAnnotationContext = new AnnotationConfigApplicationContext(ConditionalAnnotation.class);
    AnnotationConfigApplicationContext importAnnotationContext = new AnnotationConfigApplicationContext(ImportAnnotation.class);
    AnnotationConfigApplicationContext factoryBeanAnnotationContext = new AnnotationConfigApplicationContext(FactoryBeanAnnotation.class);

    @Test
    public void testGetBeanByXML(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person bean = (Person)context.getBean("person");
        System.out.println(bean.toString());
    }

    @Test
    public void testGetBeanByAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAnnotation.class);
        Person bean = (Person)context.getBean("person");
        System.out.println(bean.toString());
    }

    @Test
    public void testComponentScan(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanAnnotation.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void testScopeAnnotation(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeAnnotation.class);
        System.out.println("ioc容器初始化完成");
        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean == bean2);
    }

    @Test
    public void testLazyAnnotation(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyAnnotation.class);
        System.out.println("ioc容器初始化完成");
        /*如果不获取 则不会加入到容器当中*/
//        Object bean = applicationContext.getBean("person");
//        Object bean2 = applicationContext.getBean("person");
//        System.out.println(bean == bean2);
    }

    @Test
    public void testConditionalAnnotation(){
        String[] namesForType = conditionalAnnotationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = conditionalAnnotationContext.getEnvironment();
        //获取当前操作系统
        String property = environment.getProperty("os.name");
        System.out.println(property);
        for (String name : namesForType) {
            System.out.println(name);
        }

        Map<String, Person> persons = conditionalAnnotationContext.getBeansOfType(Person.class);
        System.out.println(persons);

    }

    @Test
    public void testImport(){
        printBeans(importAnnotationContext);
        ImportEntity bean = importAnnotationContext.getBean(ImportEntity.class);
        System.out.println(bean);
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void testFactoryBean(){
        //工厂Bean获取的是调用getObject创建的对象
        Object bean2 = factoryBeanAnnotationContext.getBean("factoryBeanEntity");
        Object bean3 = factoryBeanAnnotationContext.getBean("factoryBeanEntity");
        System.out.println("bean的类型："+bean2.getClass());
        System.out.println(bean2 == bean3);

        Object bean4 = factoryBeanAnnotationContext.getBean("&factoryBeanEntity");
        System.out.println(bean4.getClass());
    }
}
