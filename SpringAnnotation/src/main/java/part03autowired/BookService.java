package part03autowired;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 9:22
 * @Author: code1990
 * @Description:
 */
@Service
public class BookService {

    //@Qualifier("bookDao") 指定别名
    //@Autowired(required=false) //默认装配则一定要注入required=true 否则报错
    //@Resource(name="bookDao2") 默认使用类名小写的方式 可以可以使用给定的名字
    @Inject//与@Autowired功能相同 无required=false
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }
}
