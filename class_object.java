/* Class definition */
class Demo {

    // Fields
    int a = 10;
    String b = "baibhav";

    // Method to display the values
    void Show() {
        System.out.println(a + " " + b); // Changed to standard output
    }

}

/* Main class */
class Test {

    public static void main(String[] args) {
        // Object creation
        Demo r = new Demo(); // Creating an object of class Demo
        r.Show();            // Calling the Show method of Demo
    }

}
