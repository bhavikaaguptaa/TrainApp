public class UseCase20ExceptionHandlingSearch {

    // Method to simulate search operation
    static void searchBogie(String[] bogies, String searchKey) {

        // Defensive check (Fail-Fast Principle)
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException(
                "Search operation failed: Train has no bogies available."
            );
        }

        boolean found = false;

        // Linear search logic (only runs if data exists)
        for (int i = 0; i < bogies.length; i++) {

            if (bogies[i].equals(searchKey)) {
                System.out.println("Result: Bogie Found ✔ at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Result: Bogie Not Found ✖");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC20: Exception Handling During Search Operations");
        System.out.println();

        // Case 1: Empty train (will trigger exception)
        String[] emptyTrain = {};

        // Case 2: Valid train data
        String[] bogies = {
            "BG101",
            "BG205",
            "BG309"
        };

        String searchKey = "BG205";

        System.out.println("Case 1: Searching in empty train");

        try {
            searchBogie(emptyTrain, searchKey);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nCase 2: Searching in active train");

        try {
            searchBogie(bogies, searchKey);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nSystem continues safely ✔");
    }
}