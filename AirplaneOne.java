package Airplans;

public class AirplaneOne {
    //змінні екземпляра класу
    private double speed;
    private int passenger;
    private String model;

    //генерований конструктор
    public AirplaneOne(double speed, int passenger, String model) {
        this.speed = speed;
        this.passenger = passenger;
        this.model = model;
    }

    // Методи get і set для змінної speed
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Методи get і set для змінної passenger
    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        // Автоматично збільшуємо значення удвічі
        this.passenger = passenger*2;
    }

    // Метод get для змінної model (без setter, оскільки модель не можна змінювати)

    public String getModel() {
        return model;
    }

    //виводить інформацію на консоль і не повертає жодного значення (void)
    public void Information() {
        System.out.println("AirplaneOne - Model: " + model + ", Speed: " + speed + " km/h, Passengers: " + passenger);
    }
    //типізований метод що повертає значення  результату  відстані
    public double calculateDistance(double time) {
        return speed * time;
    }

    //типізований метод що повертає значення результату часу в дорозі
    public double calculateTravelTime(double distance) {
        return distance / speed;
    }

    public void callMethod(AirplaneOne anotherAirplane) {
        anotherAirplane.method(); // Виклик методу на переданому екземплярі класу
    }

    public void method() {
        System.out.println("Method викликано в класі AirplaneOne.");
    }
    //призначений для виклику і виводу значення пасажирів іншого літака.
    public void callVariable(AirplaneOne anotherAirplane) {
        // Виклик змінної екземпляра класу, який передано в якості параметру
        int anotherPassenger = anotherAirplane.passenger;
        System.out.println("Змінна passenger іншого об'єкта: " + anotherPassenger);

    }
    // Оголошення final методу
    public final void finalMethod() {
        System.out.println("final метод");
    }
}
