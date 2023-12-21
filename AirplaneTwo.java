package Airplans;

public final class AirplaneTwo extends AirplaneOne {
    // Оголошуємо приватні поля класу AirplaneTwo для швидкості, пасажирів і моделі літака
    private double speed;
    private int passenger;
    private String model;
    // Конструктор класу
    public AirplaneTwo(double speed, int passenger, String model) {
        // Викликаємо конструктор  класу AirplaneOne
        super(speed, passenger, model);

    }
    // Методи get і set для змінної speed
    public double getSpeed() {
        return super.getSpeed();
    }
    public void setSpeed(double speed) {
        super.setSpeed(speed);
    }

    // Методи get і set для змінної passenger
    public int getPassenger() {
        return super.getPassenger();
    }

    public void setPassenger(int passenger) {
        super.setPassenger(passenger);
    }

    // Метод get для змінної model (без setter, оскільки модель не можна змінювати)
    public String getModel() {
        return super.getModel();
    }
    @Override //перевизначення
    public void Information() {
        System.out.println("AirplaneTwo - Model: " + model + ", Speed: " + speed + " km/h, Passengers: " + passenger);
    }
    // Метод для обчислення витрат пального на певну відстань
    public double calculateFuelConsumption(double distance) {
        return distance / (double) speed;
    }
    // Метод для обчислення часу подорожі на певну відстань
    public double calculateTravelTime(double distance) {
        return distance / (speed * 1.2);
    }
}

