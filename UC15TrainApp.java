// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {

    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Cargo assignment logic with safety rules
    void assignCargo(String cargo) {

        try {
            System.out.println("\nAssigning cargo: " + cargo + " to " + shape + " bogie");

            // Safety Rule: Petroleum cannot be placed in Rectangular bogie
            if (shape.equalsIgnoreCase("Rectangular")
                    && cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe Assignment: Petroleum cannot be stored in Rectangular bogie"
                );
            }

            // If safe
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully ✔");

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Validation completed for " + shape + " bogie");
        }
    }
}

// Main Class
public class UseCase15CargoSafety {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC15: Safe Cargo Assignment Using try-catch-finally");
        System.out.println();

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will trigger exception)
        b2.assignCargo("Petroleum");

        // Program continues safely
        System.out.println("\nSystem continues running without crash ✔");
    }
}