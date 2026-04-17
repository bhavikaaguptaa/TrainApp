class InvalidCapacityException extends Exception {

    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException(
                "Capacity must be greater than zero"
            );
        }

        this.type = type;
        this.capacity = capacity;
    }
}

public class UseCase14CustomException {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC14: Handle Invalid Bogie Capacity");
        System.out.println();

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1.type + " Capacity: " + b1.capacity);

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Created: " + b2.type);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program Continues Safely.");
    }
}