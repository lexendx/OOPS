
class Car {


    // Declare the variables
    String name;
    String colour;
    int price;

    // Constructor for initializing the object
    public Car(String name, String colour, int price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    // Getter methods to access the variables
    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }
}
