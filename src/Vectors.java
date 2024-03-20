import java.util.ArrayList;
import java.util.Scanner;

public class Vectors {
    private final ArrayList<Double> vector1;
    private final ArrayList<Double> vector2;
    private final Scanner scanner;

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

    public ArrayList<Double> addVectors() throws DifferentLengthVectorsException {
        if (this.vector1.size() != this.vector2.size()) {
            throw new DifferentLengthVectorsException(this.vector1.size(), this.vector2.size());
        }

        ArrayList<Double> addedVectors = new ArrayList<>();
        for (int i = 0; i < this.vector1.size(); i++) {
            Double sum = this.vector1.get(i) + this.vector2.get(i);
            addedVectors.add(sum);
        }

        return addedVectors;
    }


}
