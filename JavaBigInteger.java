import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigInteger {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String fString = bf.readLine();
        BigInteger fInteger = new BigInteger(fString);

        String sString = bf.readLine();
        BigInteger sInteger = new BigInteger(sString);
        BigInteger sum = fInteger.add(sInteger);
        BigInteger prod = fInteger.multiply(sInteger);

        System.out.println(sum);
        System.out.println(prod);

    }
}
