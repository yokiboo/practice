package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("koko");
        return p;
    }
    @Bean
    String hello(){
        return "hello";
    }
    @Bean
    Integer num(){
        return 10;
    }

}
