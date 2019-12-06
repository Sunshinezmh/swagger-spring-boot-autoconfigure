package com.github.sunshinezmh.swaggerspringbootautoconfigure;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;


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
