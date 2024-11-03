public class ICICI extends Bank {
    private double additionalCharge;

    public ICICI() {
        super();
        this.additionalCharge = 10.0;
    }

    @Override
    public double calculateTransactionCharges(double amount) {
        return super.calculateTransactionCharges(amount) + additionalCharge;
    }
}
