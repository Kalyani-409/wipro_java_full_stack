class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog bak bak bukk");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Animal a = new Dog();  
        a.sound();  
    }
}
