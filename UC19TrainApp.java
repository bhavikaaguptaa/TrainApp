import java.util.Arrays;

public class UseCase19BinarySearch {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC19: Binary Search for Bogie ID (Optimized Searching)");
        System.out.println();

        // Bogie IDs (must be sorted for binary search)
        String[] bogieIDs = {
            "BG101",
            "BG205",
            "BG309",
            "BG412",
            "BG550"
        };

        // Ensure sorted order (good practice even if already sorted)
        Arrays.sort(bogieIDs);

        String searchKey = "BG412";

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        System.out.println("\nSearching for: " + searchKey);

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchKey.compareTo(bogieIDs[mid]);

            if (comparison == 0) {
                found = true;
                System.out.println("Result: Bogie Found ✔ at index " + mid);
                break;
            }

            else if (comparison > 0) {
                low = mid + 1; // search right half
            }

            else {
                high = mid - 1; // search left half
            }
        }

        if (!found) {
            System.out.println("Result: Bogie Not Found ✖");
        }

        System.out.println("\nSystem continues safely ✔");
    }
}