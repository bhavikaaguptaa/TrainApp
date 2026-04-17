class PassengerBogie {

    String type;
    int capacity;

    PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class UseCase16BubbleSort {

    // Bubble Sort Logic (Manual Sorting)
    static void sortByCapacity(PassengerBogie[] bogies) {

        int n = bogies.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent capacities
                if (bogies[j].capacity > bogies[j + 1].capacity) {

                    // Swap objects
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps happened → already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Display method
    static void displayBogieCapacities(PassengerBogie[] bogies) {

        for (PassengerBogie b : bogies) {
            System.out.print(b.capacity + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC16: Sort Passenger Bogies by Capacity (Bubble Sort)");
        System.out.println();

        // Sample passenger bogies
        PassengerBogie[] bogies = {
            new PassengerBogie("Sleeper", 72),
            new PassengerBogie("AC Chair", 56),
            new PassengerBogie("First Class", 24),
            new PassengerBogie("Sleeper", 70),
            new PassengerBogie("AC Chair", 60)
        };

        System.out.println("Before Sorting:");
        displayBogieCapacities(bogies);

        // Sorting using Bubble Sort
        sortByCapacity(bogies);

        System.out.println("\nAfter Sorting:");
        displayBogieCapacities(bogies);

        System.out.println("\nSystem continues safely ✔");
    }
}