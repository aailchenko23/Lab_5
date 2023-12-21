package Airplans;

public  class AirplaneFifth {
    final double length;
    final double width;
    final String name;

    public AirplaneFifth(double length, double width, String name) {
        this.length = length;
        this.width = width;
        this.name = name;
    }

    // Перший метод: використання усіх змінних екземпляра класу оголошених як final
    public double calculateArea() {
        return length * width;
    }

    // Другий метод: створення та використання  змінних оголошених як final
    public void displayInfo() {
        final String info = "Airplane: " + name + ", Length: " + length + ", Width: " + width;
        System.out.println(info);

    }
}

