package com.github.Sunshinezmh.swaggerspringbootautoconfigure;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 开启Swagger属性判断注解定义
 * @Classname SwaggerCondition
 * @Auther sunshinezhang
 * @Date 2019/12/4 20:48
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSwaggerCondition.class)
public @interface SwaggerCondition {
}
