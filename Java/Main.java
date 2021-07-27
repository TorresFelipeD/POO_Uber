package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car car = new Car("ABC123", new Account("Diego Torres", "81512323"));
        car.passenger = 4;
        System.out.println("Car license: " + car.license);

        Car car2 = new Car("DEA123", new Account("Andrea Herrera", "58741555"));
        car2.passenger = 2;
        System.out.println("Car license: " + car2.license);

        System.out.println(car2.DataCar());
    }
}