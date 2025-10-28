package lesson4_class_object;

public class BankAccount {
    private int id;
    private String name;
    private double balance;

    public BankAccount() {
    }

    // Конструктор с именем и балансом, ID генерируется автоматически
    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public void display() {
        System.out.println("ID: " + this.id + "\nName: " + this.name + "\nBalance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Son Tung M-TP", 1000.00);
        BankAccount bankAccount1 = new BankAccount(2, "Nguyen Van A", 2000.00);
        BankAccount bankAccount2 = new BankAccount();

        bankAccount2.id = 3;
        bankAccount2.name = "Diep Nguyen";
        bankAccount2.balance = 5000.00;

        bankAccount.withdraw(2500);
        bankAccount.display();
        bankAccount2.display();
        bankAccount1.deposit(3000);
        bankAccount1.display();

        if (bankAccount.balance > bankAccount1.balance) {
            System.out.println("Account 1 is bigger than Account 2");
        } else {
            System.out.println("Account 2 is bigger than Account 1");
        }
    }
}