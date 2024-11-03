import java.util.*;

public class Loops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N > 1 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                int mul = N * i;
                System.out.println(N + " x " + i + " = " + mul);
            }
        }
        scanner.close();
    }
}
