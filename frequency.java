public class Frequency {
    public static void main(String[] args) {
        int[] arr = {12, 15, 12, 18, 20, 12, 12}; // Correct array initialization
        int[] frequency = new int[101]; // Array to store frequencies

        // Loop through the input array and calculate frequencies
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++; // Increment the frequency of each element
        }

        // Print the frequencies of the elements
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Print only non-zero frequencies
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
