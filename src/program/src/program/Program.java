package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1000,"Welton",1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002,"Sara",1000.0,0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003,"BOB",1000.0,500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
