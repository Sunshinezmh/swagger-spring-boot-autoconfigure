package com.dmsdbj.team3.swaggerspringbootautoconfigure;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * Swagger属性条件类
 *
 * @Classname OnSwaggerCondition
 * @Auther sunshinezhang
 * @Date 2019/12/4 20:47
 */
public class OnSwaggerCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
		String basePackage = conditionContext.getEnvironment().getProperty("swagger.basePackage");
		if (Objects.isNull(basePackage)) {
			throw new RuntimeException("please config basePackage first");
		}else {
			return true;
		}
	}

}
