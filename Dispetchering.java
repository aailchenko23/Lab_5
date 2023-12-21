package Airplans;

public class Dispetchering {
    AirplaneOne airplaneOne = new AirplaneOne(500, 150, "Model1");
    AirplaneTwo airplaneTwo = new AirplaneTwo(700, 200, "Model2");
    AirplaneOne airplane; // Змінна для динамічної диспетчеризації

    void menu(int number) {
        if (number == 1) {
            airplane = airplaneOne;
            airplane.Information();
        } else if (number == 2) {
            airplane = airplaneTwo;
            airplane.Information();
        }
    }
}