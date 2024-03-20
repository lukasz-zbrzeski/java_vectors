import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Double> readVector(Vectors vectors, Scanner scanner) {
        ArrayList<Double> vector = new ArrayList<>();

        boolean cond = true;
        while (cond) {
            try {
                vector = vectors.fetchVector(scanner);
            } catch (NumberFormatException e) {
                System.out.print("The given string is not a number. Enter vector again: ");
                continue;
            }
            cond = false;
        }

        return vector;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Vectors vectors = new Vectors();

        boolean areCorrectVectors = false;

        while (!areCorrectVectors) {
            System.out.print("Enter first vector: ");
            ArrayList<Double> vector1 = readVector(vectors, scanner);

            System.out.print("Enter second vector: ");
            ArrayList<Double> vector2 = readVector(vectors, scanner);

            try {
                ArrayList<Double> resultOfAddingVectors = vectors.addVectors(vector1, vector2);
                vectors.saveVector(resultOfAddingVectors);
            } catch (DifferentLengthVectorsException e) {
                System.out.println(e.getMessage());
                continue;
            }
            areCorrectVectors = true;
        }

    }
}
