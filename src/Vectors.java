import java.util.ArrayList;
import java.util.Scanner;

public class Vectors {
    public ArrayList<Double> fetchVector(Scanner scanner) {
        ArrayList<Double> vector = new ArrayList<>();

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            vector.add(Double.valueOf(number));
        }

        return vector;
    }
    
}
