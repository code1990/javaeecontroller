package part00componetregister;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 17:03
 * @Author: code1990
 * @Description:
 */
public class MyTypeFilter implements TypeFilter {
    /**
     *metadataReader 当前正在读取的类
     * MetadataReaderFactory 可以获取任何的其他的类信息
     * @param
     * @return false 表示一个都不匹配
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        /*获取当前类的注解的信息*/
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        /*获取当前正在扫描的类的类信息*/
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        /*获取当前类路径*/
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println(">>>>>>"+className);
        if(className.contains("er")){
            /*配置成功*/
            return  true;
        }
        return false;
    }
}
