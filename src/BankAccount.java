public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void  deposit(double sum){
        amount = amount + sum;
    }
    public void withDraw(int sum) throws LimitException {
        amount =  amount - sum ;
if (sum > amount){
    throw new LimitException("Запрашиваемая сумма больше остатка на счету: " + amount,amount);

}
    }

}
