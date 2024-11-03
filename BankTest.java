public class BankTest {
    public static void main(String[] args) {
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();

        double amount = 1000.0;

        System.out.println("ICICI Transaction Charges: " + icici.calculateTransactionCharges(amount));
        System.out.println("HDFC Transaction Charges: " + hdfc.calculateTransactionCharges(amount));
    }
}
