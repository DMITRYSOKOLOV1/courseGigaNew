package lesson4_class_object;

public class BankAccount {
    private int id;
    private String name;
    private double balance;

    // Статическая переменная для генерации уникального ID
    private static int nextId = 1;

    // Конструктор с именем и балансом, ID генерируется автоматически
    public BankAccount(String name, double balance) {
        this.id = nextId++;
        this.name = name;
        this.balance = balance;
    }

    // Пустой конструктор (если нужно)
    public BankAccount() {
        this.id = nextId++;
        this.name = "Unnamed";
        this.balance = 0.0;
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
        BankAccount bankAccount = new BankAccount("Nguyen Van A", 10000.00);
        BankAccount bankAccount1 = new BankAccount("Son Tung M-TP", 200000.00);

        bankAccount.withdraw(2500);
        bankAccount.display();

        bankAccount1.deposit(3000);
        bankAccount1.display();

        if (bankAccount.balance > bankAccount1.balance) {
            System.out.println("Account 1 is bigger than Account 2");
        } else {
            System.out.println("Account 2 is bigger than Account 1");
        }
    }
}