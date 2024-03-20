public class DifferentLengthVectorsException extends Exception {
    private final int length1;
    private final int length2;

    public DifferentLengthVectorsException(int length1, int length2) {
        this.length1 = length1;
        this.length2 = length2;
    }

    @Override
    public String getMessage() {
        return "The length of the first vector is " + this.length2 + " and the second is " + this.length1 + ". Lengths must be equal.";
    }
}
