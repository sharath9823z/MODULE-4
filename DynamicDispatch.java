class Animal10 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog10 extends Animal10 {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat10 extends Animal10 {
    void sound() {
        System.out.println("Meow");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Animal10 a = new Animal10();
        a.sound();

        a = new Dog10();
        a.sound();

        a = new Cat10();
        a.sound();
    }
}
