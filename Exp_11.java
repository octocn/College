public class Main {
    public static void main(String[] args) {
        int marks = 110;
        try {
            if (marks > 100) {
                throw new MarksOutOfBoundsException("Marks cannot be greater than 100");
            }
            System.out.println("Marks entered: " + marks);
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}
