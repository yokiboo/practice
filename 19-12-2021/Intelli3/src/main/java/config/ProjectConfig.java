package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("koko")
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("koko");
        return p;
    }

    @Bean(name = "miki")
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("miki");
        return p;
    }

    @Bean(value = "riki")
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("riki");
        return p;
    }

}
