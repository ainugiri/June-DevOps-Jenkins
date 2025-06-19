public class Car {
    // Class members (attributes/fields)
    private String make;
    private String model;
    private int year;
    private String color;

    // Constructor(s)
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Getter methods (accessors)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Setter methods (mutators)
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Behavior methods (methods)
    public void start() {
        System.out.println("The car is starting.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void brake() {
        System.out.println("The car is braking.");        
        System.out.println("The car is braking.");

    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
  public static void main(String[] args){
    System.out.println("Car Class created in GitHub, executing from Jenkins Server");
}
}
