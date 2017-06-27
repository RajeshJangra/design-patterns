package patterns.behavioral.strategy;

public class BankAccountPaymentMethod implements PaymentMethod {
    private int accountNumber;
    private String name;
    private String branchId;

    public BankAccountPaymentMethod(final int accountNumber, final String name, final String branchId) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.branchId = branchId;
    }

    @Override
    public void pay(final double amount) {
        System.out.println("Paid: " + amount + " with Bank Account: " + this);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getBranchId() {
        return branchId;
    }

    //Don't do it in actual systems
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccountPaymentMethod{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", name='").append(name).append('\'');
        sb.append(", branchId='").append(branchId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
