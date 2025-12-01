class Animal8 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog8 extends Animal8 {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal8 a = new Animal8();
        a.sound();

        Dog8 d = new Dog8();
        d.sound();
    }
}
