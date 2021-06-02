package entities;

public class SavingsAccount extends Account{

    private Double interesRate;
    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interesRate) {
        super(number, holder, balance);
        this.interesRate = interesRate;
    }

    public Double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(Double interesRate) {
        this.interesRate = interesRate;
    }
    public void udateBalance(){
        balance += balance*interesRate;
    }

    //@Overrride pode alterar um método de uma classe herdada (extends)
    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }

}
