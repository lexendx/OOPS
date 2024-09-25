public class DefaultConstructor {
    public static void main(String[] args) {
        // Creating an instance of inner class B
        DefaultConstructor outer = new DefaultConstructor();
        B inner = outer.new B();
    }
    
    int a; 
    String b; 
    boolean c;

    // Constructor
    DefaultConstructor() {
        a = 100;
        b = "baibhav";
        c = true;
    }

    // Method to display values
    void Show() {
        System.out.println(a + " " + b + " " + c);
    }

    // Inner class B
    class B {
        DefaultConstructor ref = new DefaultConstructor();

        // Constructor of B to call Show
        B() {
            ref.Show();  // Accessing Show() correctly
        }
    }

   
}
