import java.util.ArrayList;
import java.util.Scanner;

public class Vectors {
    private ArrayList<Double> vector1;
    private ArrayList<Double> vector2;
    private Scanner scanner;

    public Vectors(ArrayList<Double> vector1, ArrayList<Double> vector2, Scanner scanner) {
        this.vector1 = vector1;
        this.vector2 = vector2;
        this.scanner = scanner;
    }

    public ArrayList<Double> fetchVector() {
        ArrayList<Double> vector = new ArrayList<>();

        String input = this.scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            vector.add(Double.valueOf(number));
        }

        return vector;
    }


}
