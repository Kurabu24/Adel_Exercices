public class CheckingAccount extends BankAccount{
    @Override
    public void Withdraw(double money){
        if(this.isEmpty()){
            System.out.println("You cannot withdraw money");
        }
        else{
            super.Withdraw(money);
        }
    }
}
