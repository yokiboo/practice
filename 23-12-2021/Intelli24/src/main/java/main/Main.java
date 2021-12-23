package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;


public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        System.out.println("Before instance creation");
        var service = context.getBean(CommentService.class);
        System.out.println("After instance creation");

    }
}
