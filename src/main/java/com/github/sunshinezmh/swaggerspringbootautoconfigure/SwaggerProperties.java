package com.github.sunshinezmh.swaggerspringbootautoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


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
