package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Welton",0.01);
        BusinessAccount bcc = new BusinessAccount(1002,"Sara",0.0,500.0);

        //UPCASTING
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003,"Gog",0.0,200.2);
        Account acc3 = new SavingsAccount(1004,"Alfred",0.0,0.04);


        //DOWNCATING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Emprestimo realizado!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.udateBalance();
            System.out.println("Update");
        }

    }
}
