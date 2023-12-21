package Airplans;

public class Main {
    public static void main(String[] args) {
        Dispetchering dsp = new Dispetchering();
        dsp.menu(1);
        dsp.menu(2);
// Створення об'єкта класу AirplaneSixth
        AirplaneSixth airplane = new AirplaneSixth(1000, 250, "Airbus A380");
        // Виклик методу зовнішнього класу
        airplane.methodSixth();

        // Виклик методу тестування внутрішнього класу
        airplane.test();

        // Виклик методу з класу AirplaneThree (батьківського класу)
        airplane.getModel();

        // Виклик першого статичного методу
        double area = AirplaneFourth.square();
        // Виклик другого статичного методу
        System.out.println("Airplane Area: " + area + " square meters");

        // Виклик другого статичного методу
        AirplaneFourth.SquareAirplane();
        AirplaneOne airplaneOne= new AirplaneOne(800, 150, "Boeing 747");
        airplaneOne.callMethod(airplaneOne);
        airplaneOne.callVariable(airplaneOne);
        AirplaneTwo airplaneTwo = new AirplaneTwo(900, 200, "Airbus A380");

        // Створення об'єктів класу AirplaneThree з різними параметрами
        AirplaneThree airplaneThree = new AirplaneThree(1000, 180, "Boeing 777");
        AirplaneThree airplaneThree1 = new AirplaneThree(1000, 180, "Boeing 777");
        AirplaneThree airplaneThree2 = new AirplaneThree(1200, 200);
        AirplaneThree airplaneThree3 = new AirplaneThree(800);
        AirplaneThree airplaneThree4 = new AirplaneThree();
        //виклик всіх перевизначених та перевантажених методів
        airplaneOne.Information();
        System.out.println("Distance traveled: " + airplaneOne.calculateDistance(2) + " km");

        airplaneTwo.Information();
        System.out.println("Fuel consumption: " + airplaneTwo.calculateFuelConsumption(1000) + " liters");

        airplaneThree.Information();
        System.out.println("Travel time: " + airplaneThree.calculateTravelTime(1500) + " hours");
        airplaneOne.Information();
        System.out.println("Distance traveled: " + airplaneOne.calculateDistance(2) + " km");

        airplaneTwo.Information();
        System.out.println("Fuel consumption: " + airplaneTwo.calculateFuelConsumption(1000) + " liters");
        //Виклик конструктора 4-ма довільними варіантами
        airplaneThree1.Information();
        System.out.println("Travel time: " + airplaneThree1.calculateTravelTime(1500) + " hours");

        airplaneThree2.Information();
        System.out.println("Travel time: " + airplaneThree2.calculateTravelTime(1500) + " hours");

        airplaneThree3.Information();
        System.out.println("Travel time: " + airplaneThree3.calculateTravelTime(1500) + " hours");

        airplaneThree4.Information();
        System.out.println("Travel time: " + airplaneThree4.calculateTravelTime(1500) + " hours");
        //lab_3
        AirplaneOne Airplane = new AirplaneOne(500, 150, "Boeing 737");

        // Виводимо інформацію про літак
        Airplane.Information();

        // Змінюємо швидкість та автоматично збільшуємо її удвічі
        Airplane.setPassenger(600);

        // Виводимо оновлену інформацію
        System.out.println("Updated Information:");
        Airplane.Information();
        // Створення та ініціалізація трьох екземплярів класу AirplaneFifth
        AirplaneFifth airplane1 = new AirplaneFifth(45.4, 8.2, "Boeing 747");
        AirplaneFifth airplane2 = new AirplaneFifth(55.0, 9.0, "Airbus A380");
        AirplaneFifth airplane3 = new AirplaneFifth(40.0, 7.5, "Boeing 737");

        // Виклик методів, що використовують змінні final
        double area1 = airplane1.calculateArea();
        System.out.println("Area of " + airplane1.name + ": " + area1);

        double area2 = airplane2.calculateArea();
        System.out.println("Area of " + airplane2.name + ": " + area2);

        double area3 = airplane3.calculateArea();
        System.out.println("Area of " + airplane3.name + ": " + area3);
    }
}