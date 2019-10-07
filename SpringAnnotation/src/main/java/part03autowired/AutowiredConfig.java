package part03autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 9:32
 * @Author: code1990
 * @Description:
 */

/**
 * 自动装配;
 * Spring利用依赖注入（DI），完成对IOC容器中中各个组件的依赖关系赋值；
 * <p>
 * 1）、@Autowired：自动注入：
 * 1）、默认优先按照类型去容器中找对应的组件:applicationContext.getBean(BookDao.class);找到就赋值
 * 2）、如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 * applicationContext.getBean("bookDao")
 * 3）、@Qualifier("bookDao")：使用@Qualifier指定需要装配的组件的id，而不是使用属性名
 * 4）、自动装配默认一定要将属性赋值好，没有就会报错；
 * 可以使用@Autowired(required=false);
 * 5）、@Primary：让Spring进行自动装配的时候，默认使用首选的bean；
 * 也可以继续使用@Qualifier指定需要装配的bean的名字
 * BookService{
 *
 * @Autowired BookDao  bookDao;
 * }
 * <p>
 * 2）、Spring还支持使用@Resource(JSR250)和@Inject(JSR330)[java规范的注解]
 * @Resource: 可以和@Autowired一样实现自动装配功能；默认是按照组件名称进行装配的；
 * 没有能支持@Primary功能没有支持@Autowired（reqiured=false）;
 * @Inject: 需要导入javax.inject的包，和Autowired的功能一样。没有required=false的功能；
 * @Autowired:Spring定义的； @Resource、@Inject都是java规范
 * <p>
 * AutowiredAnnotationBeanPostProcessor:解析完成自动装配功能；
 */
@Configuration
@ComponentScan("part03autowired")
public class AutowiredConfig {

    @Primary//设置优先级 多个当中 选择当前标注的这个
    @Bean("bookDao2")
    public BookDao bookDao() {
        BookDao bookDao = new BookDao();
        bookDao.setFlag(true);
        return bookDao;
    }

    /**
     * @param bookDao
     * @return
     * @Bean标注的方法创建对象的时候，方法参数BookDao的值从容器中获取
     * 可以写成@Autowired BookDao bookDao 因为从容器中获取所以可以省略不写
     */
    @Bean("getBookEntity")
    public BookEntity getBookEntity(BookDao bookDao) {
        BookEntity entity = new BookEntity(bookDao);
        return entity;
    }
}
