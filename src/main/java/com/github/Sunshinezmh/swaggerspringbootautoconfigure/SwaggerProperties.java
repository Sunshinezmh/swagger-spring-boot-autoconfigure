package com.github.Sunshinezmh.swaggerspringbootautoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger属性定义
 * @Classname SwaggerProperties
 * @Auther sunshinezhang
 * @Date 2019/12/4 20:48
 */
@EnableSwagger2
@ConfigurationProperties(prefix = "swagger")
@Data
public class SwaggerProperties {

	private String basePackage;

	private String title = "API";

	private String description;

	private String url;

	private String contact = "JoeBig7";

	private String version = "1.0";
}
