package part00componetregister;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 16:58
 * @Author: code1990
 * @Description:
 */

@Configuration
//如果是jdk1.8 可以分别指定多个扫描规则

//@ComponentScan()
//@ComponentScan()
//如果不是jdk1.8 可以使用 @ComponentScans 在内部指定扫描规则
@ComponentScans(
    value = {
            @ComponentScan(value="part00componetregister",includeFilters = {
/*						@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
                    @Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
                    @Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
            },useDefaultFilters = false)
    }
)
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件 必须设置useDefaultFilters = false 默认全部扫描
//FilterType.ANNOTATION：按照注解类型扫描 @Filter(type=FilterType.ANNOTATION,classes={Controller.class})扫描所有的controller
//FilterType.ASSIGNABLE_TYPE：按照给定的类型扫描；@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class})扫描所有的BookService及其子类
//FilterType.ASPECTJ：使用ASPECTJ表达式（很少使用）
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class ComponentScanAnnotation {
    @Bean("person")
    public Person person01(){
        return new Person("lisi",20);
    }
}
