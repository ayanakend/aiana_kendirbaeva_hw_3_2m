public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount + sum;
    }
    public void withDraw(int sum) throws LimitException {
        if (amount < sum){
            throw new LimitException("Top up your account. Your amount: " + amount, (int) amount);
        } else {
            amount = amount - sum;}
    }
}