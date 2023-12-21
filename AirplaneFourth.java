package Airplans;

public abstract class AirplaneFourth {
    static double length;
    static double width;

    static {
        length = 45.4;
        width = 8.2;
    }
    // Перший статичний метод: визначення площі літака
     static double square() {
        return length * width;
    }
    // Другий статичний метод: використання результатів роботи першого методу
    static void SquareAirplane() {
        // Виклик першого статичного методу для визначення площі
        double area = square();
       }
    }
