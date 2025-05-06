package EncapsulationStudy07;

public class Account {
    private String accountNumber;
    private double balance;
    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(){
        this("empty", 0.0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money){
        balance += money;
    }
    public void withdraw(double money){
        balance -= money;
    }
}
