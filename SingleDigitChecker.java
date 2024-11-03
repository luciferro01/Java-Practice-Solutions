class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class SingleDigitChecker {
    public static void checkSingleDigit(int number) throws InvalidNumberException {
        if (number < -9 || number > 9) {
            throw new InvalidNumberException("The number has more than one digit!");
        } else {
            System.out.println("The number is a single digit: " + number);
        }
    }

    public static void main(String[] args) {
        int[] testNumbers = { 5, 12, -3, 100, -45, 0 };

        for (int number : testNumbers) {
            try {
                checkSingleDigit(number);
            } catch (InvalidNumberException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }
}
