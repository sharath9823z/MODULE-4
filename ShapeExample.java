class Shape6 {
    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Circle6 extends Shape6 {
    void area() {
        double radius = 5;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle6 extends Shape6 {
    void area() {
        double length = 6;
        double width = 4;
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Circle6 c = new Circle6();
        Rectangle6 r = new Rectangle6();

        c.displayShape();
        c.area();

        r.displayShape();
        r.area();
    }
}
