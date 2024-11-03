public class Bank {
    protected double defaultTransactionCharge;

    public Bank() {
        this.defaultTransactionCharge = 50.0; // Default
    }

    public double getDefaultTransactionCharge() {
        return defaultTransactionCharge;
    }

    public double calculateTransactionCharges(double amount) {
        return defaultTransactionCharge + (amount * 0.02); // Default
    }
}
