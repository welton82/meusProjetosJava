package entities;
/*1 - A palavra FINAL evita que a classe seja herdada ou que o método seja sobreposto
* 2 - Podemos usar a palavra 'final' por segurança;
* 3 - Convém acrescentar 'final' nos métodos sobrepostos para não gerar inconsistência
* 4 - O String é uma classe 'final'
**/
public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        super();
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //para saque
    public void withdraw(double amount){
        balance -= amount+5.0;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
