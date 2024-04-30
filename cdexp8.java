import java.util.Objects;
import java.util.Scanner;

public class StringComparison {
   
    // User-defined function to compare strings
    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String string2 = scanner.nextLine();
       
        // Using String.equals()
        System.out.println("Using String.equals(): " + string1.equals(string2));

        // Using String.equalsIgnoreCase()
        System.out.println("Using String.equalsIgnoreCase(): " + string1.equalsIgnoreCase(string2));

        // Using Objects.equals()
        System.out.println("Using Objects.equals(): " + Objects.equals(string1, string2));

        // Using String.compareTo()
        int comparisonResult = string1.compareTo(string2);
        System.out.println("Using String.compareTo():");
        if (comparisonResult < 0) {
            System.out.println(string1 + " is lexicographically before " + string2);
        } else if (comparisonResult > 0) {
            System.out.println(string1 + " is lexicographically after " + string2);
        } else {
            System.out.println("Both strings are lexicographically equal");
        }

        // Using user-defined function
        System.out.println("Using user-defined function: " + compareStrings(string1, string2));

        scanner.close();
    }
}