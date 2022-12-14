package com.arch.tvchannel.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    //http://localhost:1212/swagger-ui/

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

   @Bean
    public OpenAPI authorOpenAPI(){

        return new OpenAPI()
                .info(
                        new Info()
                                .title("Електронний розклад роботи телеканалу")
                                .description("3-й курс")
                                .version("1.0")
                                .contact(new Contact()
                                        .email("QWERTY@gmail.com")
                                        .name("Yarik")
                                        .url("http://localhost:1212"))
                );
    }
}
