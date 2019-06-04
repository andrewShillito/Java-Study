package Main;

public class BankAccount {

    private double balance;
    private int accountNumber;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
    }

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(1234567890, 0, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            return;
        } else {
            balance -= amount;
        }
    }
}
