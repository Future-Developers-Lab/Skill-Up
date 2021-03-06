package com.skillup.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket get() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/**"))
                .apis(RequestHandlerSelectors.basePackage("com.skillup"))
                .build().apiInfo(createApiInfo());
    }

    private ApiInfo createApiInfo() {
        return new ApiInfo("Skill Up API",
                "Offers and Companies Database",
                "2.1.37",
                "https://github.com/Future-Developers-Lab",
                new Contact("Future Developers Lab", "https://github.com/Future-Developers-Lab", "jradzik4@gmail.com"),
                "Beerware",
                "https://github.com/Future-Developers-Lab/Skill-Up",
                Collections.emptyList()
        );
    }
}
