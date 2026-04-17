import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11ValidateTrainID {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC11: Validate Train ID & Cargo Codes");
        System.out.println();

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        if (trainMatcher.matches()) {
            System.out.println("Train ID Valid: " + trainId);
        } else {
            System.out.println("Train ID Invalid: " + trainId);
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code Valid: " + cargoCode);
        } else {
            System.out.println("Cargo Code Invalid: " + cargoCode);
        }
    }
}