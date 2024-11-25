import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuffer buf = new StringBuffer();

        for (int i = A.length() - 1; i >= 0; i--) {
            buf.append(A.charAt(i));
        }
        System.out.println(buf.toString().equals(A) ? "Yes" : "No");
        sc.close();

    }
}
