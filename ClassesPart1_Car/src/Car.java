public class Car {
    private String make = "Hyundai";
    private String model= "Varna";
    private String color= "White";
    private int doors = 4;
    private boolean convertible = false;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;  // "this" is special reference name for the objects or instance, which can be used to describe itself.
    }

    public void setModel(String model) {
        this.model = model; // "this" is special reference name for the objects or instance, which can be used to describe itself.
    }

    public void setColor(String color) {
        this.color = color;  // "this" is special reference name for the objects or instance, which can be used to describe itself.
    }

    public void setDoors(int doors) {
        this.doors = doors; // "this" is special reference name for the objects or instance, which can be used to describe itself.
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door "
                + color + " "
                + make + " "
                + model + " "
                + (convertible ? "Convertible" : " "));
    }
}
