package unifor.poo.activity1.test;

import unifor.poo.activity1.domain.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("Samuel","012.345.678-91", 1400, 10000, false);
        Account account2 = new Account("Yves","123.765.987-12", 912, 8000, true);

        System.out.println(account1.bonification());
        System.out.println(account2.bonification());

        System.out.println("---------------------------");

        double firstWithdraw = account1.withdraw(1000);
        System.out.println(firstWithdraw);

        double firstDeposit = account2.deposit(2000);
        System.out.println(firstDeposit);

        account1.transferAnotherAccount(1000, account2);

        account1.printAccountInformations();
        account2.printAccountInformations();





    }
}
