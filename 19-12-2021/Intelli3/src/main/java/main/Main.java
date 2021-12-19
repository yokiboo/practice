package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p0 = context.getBean("koko",Parrot.class);
        System.out.println(p0.getName());

        Parrot p1 = context.getBean("miki",Parrot.class);
        System.out.println(p1.getName());

        Parrot p2 = context.getBean("riki",Parrot.class);
        System.out.println(p2.getName());
    }
}
