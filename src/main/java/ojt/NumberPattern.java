package main.java.ojt;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 7; // Number of rows

        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
