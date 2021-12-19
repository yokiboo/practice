package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String greet = context.getBean(String.class);
        System.out.println(greet);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
