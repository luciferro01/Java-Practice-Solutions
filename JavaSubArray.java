import java.util.Scanner;

public class JavaSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int negativeCount = 0;
        // SubArrays whose sum give the negative value
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum < 0) {
                    negativeCount++;
                    // System.out.print("[ ");
                    // for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k] + ", ");
                    // }

                    // System.out.print("]");
                    // System.out.println();
                }
            }
        }
        System.out.println(negativeCount);

        // SubArrays
        // for (int i = 0; i < n; i++) {
        // for (int j = i; j < n; j++) {
        // System.out.print("[ ");
        // for (int k = i; k <= j; k++) {
        // System.out.print(arr[k] + ", ");
        // }

        // System.out.print("]");
        // System.out.println();
        // }
        // }

        sc.close();

    }
}
