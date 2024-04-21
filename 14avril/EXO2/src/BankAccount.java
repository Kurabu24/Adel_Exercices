public class BankAccount {
    double moneyInBank;

    public Boolean isEmpty() {
        return moneyInBank > 0;
    }

    public void Withdraw(double money) {
        if (moneyInBank - money > 0) {
            moneyInBank -= money;
        }
        else{
            System.out.println("Not enough money");
        }
    }

    public void deposit(double money) {
        moneyInBank += money;
    }
}
