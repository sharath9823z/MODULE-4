class Animal1 {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog can bark");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
    }
}
