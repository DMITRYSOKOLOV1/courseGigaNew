package lesson4_class_object;

public class BankAccount {
    int id;
    String name;
    double balance;
    BankAccount(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public BankAccount() {}
    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0){
            this.balance -= amount;
        }
    }
    public void display(){
        System.out.println("ID: " + this.id + "\nName: " + this.name + "\nBalance: " + this.balance);
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Nguyen Van A", 10000.00);

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.id = 2;
        bankAccount1.name = "Son Tung M-TP";
        bankAccount1.balance = 200000.00;

        bankAccount.withdraw(2500);
        bankAccount.display();

        bankAccount1.deposit(3000);
        bankAccount1.display();

        if (bankAccount.balance > bankAccount1.balance){
            System.out.println("Account 1 is bigger than Account 2");
        } else {
            System.out.println("Account 2 is bigger than Account 1");
        }
    }
}