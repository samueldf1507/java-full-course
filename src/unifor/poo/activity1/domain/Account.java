package unifor.poo.activity1.domain;

public class Account {
    private String name;
    private String cpf;
    private int accountNumber;
    private double balance;
    private boolean isClientSpecial;

    public Account(String name, String cpf, int accountNumber, double balance, boolean isClientSpecial) {
        this.name = name;
        this.cpf = cpf;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isClientSpecial = isClientSpecial;
    }

    public void printAccountInformations() {
        System.out.println("-----------------------------------");
        System.out.println("Nome do titular: " + this.name);
        System.out.println("CPF do titular: " + this.cpf);
        System.out.println("Número da conta: " + this.accountNumber);
        System.out.println("Saldo: " + this.balance);
        System.out.println("O cliente é especial: " + this.isClientSpecial);
    }

    public double bonification() {
        System.out.println("Calculando bonificação...");
        if (isClientSpecial) {
            System.out.println("Como o cliente " + this.name + "é especial, ele recebe 10% de bonificação. Valor de:");
            System.out.print("R$");
            return balance * 0.1;
        } else {
            System.out.println("Como o cliente " + this.name + " não é especial ele recebe 5% de bonificação. Valor de: ");
            System.out.print("R$");
            return balance * 0.05;
        }
    }

    public double withdraw(double value) {
        if (value > this.balance) {
            System.out.println("Saldo insuficiente");
            return 0;
        }
        System.out.println("Saque realizado com sucesso");
        this.balance -=  value;
        System.out.println("Novo saldo: ");
        return this.balance;
    }

    public double deposit(double value) {
        System.out.println("Depósito realizado");
        this.balance += value;
        System.out.println("Novo saldo: ");
        return this.balance;
    }

    public boolean transferAnotherAccount(double value, Account accountToTransfer) {
        if (withdraw(value) > 0) {
            accountToTransfer.deposit(value);
            System.out.println("Transferência de R$ " + value  + " para: " + accountToTransfer.name);
            return true;
        } else {
            System.out.println("Transferência falhou por saldo insuficiente");
            return false;
        }
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isClientSpecial() {
        return isClientSpecial;
    }

    public void setClientSpecial(boolean clientSpecial) {
        isClientSpecial = clientSpecial;
    }
}
