public class UseCase18LinearSearch {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC18: Linear Search for Bogie ID (Array-Based Searching)");
        System.out.println();

        // Array of bogie IDs (unsorted data)
        String[] bogieIDs = {
            "BG101",
            "BG205",
            "BG309",
            "BG412",
            "BG550"
        };

        // Search key (can be changed for testing)
        String searchKey = "BG309";

        System.out.println("Bogie IDs in system:");
        for (String id : bogieIDs) {
            System.out.print(id + " ");
        }

        System.out.println("\n\nSearching for: " + searchKey);

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIDs.length; i++) {

            if (bogieIDs[i].equals(searchKey)) {
                found = true;

                System.out.println("Result: Bogie Found ✔ at index " + i);
                break; // Early termination
            }
        }

        // If not found after full traversal
        if (!found) {
            System.out.println("Result: Bogie Not Found ✖");
        }

        System.out.println("\nSystem continues safely ✔");
    }
}