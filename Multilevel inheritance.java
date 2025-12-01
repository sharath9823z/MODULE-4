class Animal2 {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Puppy2 extends Dog2 {
    void weep() {
        System.out.println("Puppy can weep");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy2 p = new Puppy2();
        p.eat();
        p.bark();
        p.weep();
    }
}
