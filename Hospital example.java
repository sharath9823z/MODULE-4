class Doctor9 {
    void consultationFee() {
        System.out.println("General Doctor fee: ₹300");
    }
}

class Dentist9 extends Doctor9 {
    @Override
    void consultationFee() {
        System.out.println("Dentist consultation fee: ₹500");
    }
}

class Cardiologist9 extends Doctor9 {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: ₹800");
    }
}

class Surgeon9 extends Doctor9 {
    @Override
    void consultationFee() {
        System.out.println("Surgeon consultation fee: ₹1000");
    }
}

public class HospitalExample {
    public static void main(String[] args) {
        Doctor9 d1 = new Doctor9();
        Doctor9 d2 = new Dentist9();
        Doctor9 d3 = new Cardiologist9();
        Doctor9 d4 = new Surgeon9();

        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
        d4.consultationFee();
    }
}
