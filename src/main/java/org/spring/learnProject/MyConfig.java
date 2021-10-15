package org.spring.learnProject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApplication.properties")
//@ComponentScan("org.spring.learnProject")
public class MyConfig {
    @Bean
    public Pet cat(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(cat());
    }
}
