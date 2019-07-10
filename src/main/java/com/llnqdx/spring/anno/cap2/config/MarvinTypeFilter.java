package com.llnqdx.spring.anno.cap2.config;
/**
 *
 */

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class MarvinTypeFilter implements TypeFilter {

    private ClassMetadata classMetadata;

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        System.out.println("annotationMetadata:" + annotationMetadata);

        classMetadata = metadataReader.getClassMetadata();
        String className = classMetadata.getClassName();
        System.out.println("className:" + className);

        Resource resource = metadataReader.getResource();
        System.out.println("resource:" + resource);

        if (className.contains("ar")) {
            return true;
        }

        return false;
    }
}
