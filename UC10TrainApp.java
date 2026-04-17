import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase10CountTotalSeats {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC10: Count Total Seats in Train");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 72));

        int totalSeats = bogies.stream()
                               .map(b -> b.capacity)
                               .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity = " + totalSeats);
    }
}