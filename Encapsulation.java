public class Encapsulation {
    private int value;

    // Setter method to set the value
    public void setValue(int x) {
        value = x;
    }

    // Getter method to get the value
    public int getValue() {
        return value;
    }

    public static class B {
        public static void main(String[] args) {
            // Create an instance of Encapsulation
            Encapsulation ref = new Encapsulation();

            // Use the setter method to set the value
            ref.setValue(100);

            // Use the getter method to print the value
            System.out.println(ref.getValue());
        }
    }
}
