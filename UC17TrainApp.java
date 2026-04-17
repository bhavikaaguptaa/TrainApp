import java.util.Arrays;

public class UseCase17ArraySort {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC17: Sort Bogie Names Using Arrays.sort()");
        System.out.println();

        // Bogie type names (unsorted input)
        String[] bogieNames = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Built-in sorting (no manual logic)
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nSystem continues safely ✔");
    }
}