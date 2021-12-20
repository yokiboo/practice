package main;

public class Parrot {
    private String name;

    public Parrot(){
        System.out.println("parrot created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "parrot : "+ name;
    }
}
