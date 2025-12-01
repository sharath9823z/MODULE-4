class Transport7 {
    void move() {
        System.out.println("Transport is moving");
    }
}

class Bus7 extends Transport7 {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers");
    }
}

class Truck7 extends Transport7 {
    void carryGoods() {
        System.out.println("Truck is carrying goods");
    }
}

public class TransportExercise {
    public static void main(String[] args) {
        Bus7 bus = new Bus7();
        bus.move();
        bus.carryPassengers();

        System.out.println();

        Truck7 truck = new Truck7();
        truck.move();
        truck.carryGoods();
    }
}
