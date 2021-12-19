package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(); // empty spring context
        Parrot p = new Parrot();


    }
}
