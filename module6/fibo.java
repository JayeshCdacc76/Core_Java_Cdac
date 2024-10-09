package module6;

public class fibo {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Create an array to hold 5 Fibonacci numbers

        // Initialize the first two numbers
        arr[0] = 0; // First Fibonacci number
        arr[1] = 1; // Second Fibonacci number

        // Print the first two Fibonacci numbers
        System.out.println(arr[0] + " " + arr[1]);

        // Calculate and print the rest of the Fibonacci numbers
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2]; // Fibonacci formula
            System.out.println(arr[i]); // Print the current Fibonacci number
        }
    }
}
