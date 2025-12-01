interface Animal4 {
    void eat();
}

interface Pet4 {
    void play();
}

class Dog4 implements Animal4, Pet4 {
    public void eat() {
        System.out.println("Dog can eat");
    }

    public void play() {
        System.out.println("Dog loves to play");
    }

    void bark() {
        System.out.println("Dog can bark");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.eat();
        d.play();
        d.bark();
    }
}
