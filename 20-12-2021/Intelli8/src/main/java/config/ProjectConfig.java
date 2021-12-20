package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
    }
    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("ella");
        p.setParrot(parrot);
        return p;
    }
}
