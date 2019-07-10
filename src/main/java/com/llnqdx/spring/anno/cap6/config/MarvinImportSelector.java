package com.llnqdx.spring.anno.cap6.config;
/**
 *
 */

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class MarvinImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //返回全类名的bean
        return new String[]{"com.llnqdx.spring.anno.cap6.bean.Fish", "com.llnqdx.spring.anno.cap6.bean.Tiger"};
    }
}
