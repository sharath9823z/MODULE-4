class Animal3 {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Cat can meow");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.eat();
        d.bark();

        System.out.println();

        Cat3 c = new Cat3();
        c.eat();
        c.meow();
    }
}
