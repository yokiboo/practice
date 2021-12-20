package beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "koko";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "parrot : "+ name;
    }
}
