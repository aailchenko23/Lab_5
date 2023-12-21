package Airplans;

public  class AirplaneThree {
    //змінні екземпляра класу
    private double speed;
    private int passenger;
    private String model;
    //генерований конструктор
    public AirplaneThree(double speed, int passenger, String model) {
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
        this.passenger = passenger;
    }
    // Метод get для змінної model (без setter, оскільки модель не можна змінювати)
    public String getModel() {
        return model;
    }

    //перевизначення конструктора 4-ма довільними варіантами
    // Конструктор, який приймає швидкість і кількість пасажирів, а модель задається за замовчуванням
    public AirplaneThree(double speed, int passenger) {
        this(speed, passenger, "Boeing 747");
    }

    public AirplaneThree(double speed) {
        this(speed, 400, "Airbus A380");
    }

    public AirplaneThree() {
        this(1000, 200, "Boeing 777");
    }
    // Метод для виведення інформації про літак
    public void Information() {
        System.out.println("AirplaneThree - Model: " + model + ", Speed: " + speed + " km/h, Passengers: " + passenger);
    }
    // Метод для розрахунку часу подорожі на певну відстань
    public double calculateTravelTime(double distance) {
        return distance / (speed * 0.8);
    }
    // Оголошуємо final метод
    public final void specialMethod() {
        System.out.println("Цей метод є final і не може бути перевизначений");
    }
        // Перевизначений метод
        public void displayDetails() {
            System.out.println("Відображення деталей");
    }
    // Перевантажений метод
    public double calculateTravelTime(double distance, double speedFactor) {
        return distance / (getSpeed() * speedFactor);
    }
}
