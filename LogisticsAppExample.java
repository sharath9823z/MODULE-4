class Transport12 {
    void deliver() {
        System.out.println("Transport is delivering goods");
    }
}

class Truck12 extends Transport12 {
    void deliver() {
        System.out.println("Truck is delivering goods");
    }
}

class Ship12 extends Transport12 {
    void deliver() {
        System.out.println("Ship is delivering goods");
    }
}

class Airplane12 extends Transport12 {
    void deliver() {
        System.out.println("Airplane is delivering goods");
    }
}

public class LogisticsAppExample {
    public static void main(String[] args) {
        Transport12 t;

        t = new Truck12();
        t.deliver();

        t = new Ship12();
        t.deliver();

        t = new Airplane12();
        t.deliver();
    }
}
