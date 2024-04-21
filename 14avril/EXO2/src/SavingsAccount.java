public class SavingsAccount extends BankAccount{
    double withdrawLimit;
    public SavingsAccount(double withdrawLimit){
        this.withdrawLimit = withdrawLimit;
    }
    @Override
    public void Withdraw(double money){
        if (this.withdrawLimit > money ){
            this.withdrawLimit -=money;
            super.Withdraw(money);
        }
        else{
            System.out.println("You cannot withdraw the money");
        }
    }
}
