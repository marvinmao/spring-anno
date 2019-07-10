package com.llnqdx.spring.anno.cap5.config;
/**
 *
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        String osName = conditionContext.getEnvironment().getProperty("os.name");
        if (osName.contains("Windows")) {
            return true;
        }
        return false;
    }
}
