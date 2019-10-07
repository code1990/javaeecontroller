package part03autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 9:34
 * @Author: code1990
 * @Description:
 */
//默认加在ioc容器中的组件，容器启动会调用无参构造器创建对象，再进行初始化赋值等操作
@Component
public class BookEntity {

    private BookDao bookDao;

    //构造器要用的组件，都是从容器中获取
    //@Autowired 只有一个有参数构造器 可以省去
    //public BookEntity(@AutowiredBookDao bookDao) { 标注在参数位置 参数从容器获取
    public BookEntity(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }
    //@Autowired
    //标注在方法，Spring容器创建当前对象，就会调用方法，完成赋值；
    //方法使用的参数，自定义类型的值从ioc容器中获取
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookDao=" + bookDao +
                '}';
    }
}
