public class StringArrayLength {

    // Method to print the size of each string in the array
    public static void printStringSizes(String[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty or null.");
            return;
        }

        // Iterate through the array and print the length of each string
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("Length of element " + (i + 1) + " (" + arr[i] + ") is: " + arr[i].length());
            } else {
                System.out.println("Element " + (i + 1) + " is null.");
            }
        }
    }

    public static void main(String[] args) {
        // Example string array
        String[] stringArray = {"apple", "banana", "cherry", null, "date"};

        // Call the method to print string sizes
        printStringSizes(stringArray);
    }
}
