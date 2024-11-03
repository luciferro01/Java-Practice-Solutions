public class HDFC extends Bank {
    private double additionalCharge;

    public HDFC() {
        super();
        this.additionalCharge = 15.0; // Additional charge specific to HDFC
    }

    @Override
    public double calculateTransactionCharges(double amount) {
        return super.calculateTransactionCharges(amount) + additionalCharge;
    }
}
