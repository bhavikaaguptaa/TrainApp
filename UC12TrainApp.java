import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UseCase12SafetyComplianceCheck {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC12: Safety Compliance Check for Goods Bogies");
        System.out.println();

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean safe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                        b.cargo.equals("Petroleum")
                );

        if (safe) {
            System.out.println("Train is Safety Compliant");
        } else {
            System.out.println("Train is NOT Safety Compliant");
        }
    }
}