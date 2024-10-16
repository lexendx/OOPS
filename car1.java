class Car1 extends Car {

    // Constructor for Car1 that calls the superclass constructor
    public Car1(String name, String colour, int price) {
        // Call the parent class (Car) constructor using super
        super(name, colour, price);
    }

    public static void main(String[] args) {
        // Create an object of Car1 and initialize it with values
        Car1 car1 = new Car1("Verna", "Black", 100);

        // Call methods to access the values from the parent class
        System.out.println("Car Name: " + car1.getName());
        System.out.println("Car Colour: " + car1.getColour());
        System.out.println("Car Price: " + car1.getPrice());
    }
}