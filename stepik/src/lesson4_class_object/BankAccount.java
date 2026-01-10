package lesson4_class_object;

public class BankAccount {
    private int id;
    private String name;
    private double balance;

    // Статическая переменная для автоматической генерации уникального ID
    private static int nextId = 1;

    // Конструктор по умолчанию
    public BankAccount() {
        this.id = nextId++;  // Автоматически присваиваем следующий ID
        this.name = "Unnamed";  // Имя по умолчанию
        this.balance = 0.0;     // Баланс по умолчанию
    }

    // Основной конструктор: принимает только имя и баланс, ID генерируется автоматически
    public BankAccount(String name, double balance) {
        this.id = nextId++;  // Увеличиваем nextId и присваиваем текущему объекту
        this.name = name;
        this.balance = balance;
    }

    // Метод для пополнения счёта
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Метод для снятия денег
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    // Метод для вывода информации о счёте
    public void display() {
        System.out.println("ID: " + this.id + "\nName: " + this.name + "\nBalance: " + this.balance);
    }

    // Дополнительный метод: возвращает ID (полезен, если нужно получить ID извне)
    public int getId() {
        return this.id;
    }

    // Точка входа в программу
    public static void main(String[] args) {
        // Создаём два счёта, ID будет присвоен автоматически
        BankAccount bankAccount = new BankAccount("Son Tung M-TP", 1000.00);
        BankAccount bankAccount1 = new BankAccount("Nguyen Van A", 2000.00);

        // Создаём счёт через пустой конструктор
        BankAccount bankAccount2 = new BankAccount();

        // Выполняем операции
        bankAccount.withdraw(2500);  // Попытка снять больше, чем есть → не выполнится
        bankAccount.display();

        bankAccount1.deposit(3000);  // Пополнение
        bankAccount1.display();

        bankAccount2.display();  // Вывод счёта с ID=3, именем "Unnamed", балансом 0.0

        // Сравниваем балансы
        if (bankAccount.balance > bankAccount1.balance) {
            System.out.println("Account 1 is bigger than Account 2");
        } else {
            System.out.println("Account 2 is bigger than Account 1");
        }
    }
}