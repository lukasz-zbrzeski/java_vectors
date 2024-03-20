import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vectors {
    public Vectors() {}

    public ArrayList<Double> fetchVector(Scanner scanner) {
        ArrayList<Double> vector = new ArrayList<>();

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            vector.add(Double.valueOf(number));
        }

        return vector;
    }

    public ArrayList<Double> addVectors(ArrayList<Double> vector1, ArrayList<Double> vector2) throws DifferentLengthVectorsException {
        if (vector1.size() != vector2.size()) {
            throw new DifferentLengthVectorsException(vector1.size(), vector2.size());
        }

        ArrayList<Double> addedVectors = new ArrayList<>();
        for (int i = 0; i < vector1.size(); i++) {
            Double sum = vector1.get(i) + vector2.get(i);
            addedVectors.add(sum);
        }

        return addedVectors;
    }

    public void saveVector(ArrayList<Double> vector) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("result_of_adding_vectors.txt"));

        for (Double number : vector) {
            bw.write(number + " ");
        }

        bw.close();
    }
}
