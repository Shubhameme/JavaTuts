public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porche");
        car.setModel("Careera GT");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Gray");

        System.out.println("make = "+ car.getMake());
        System.out.println("Model = "+ car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Red");

        targa.describeCar();

    }
}