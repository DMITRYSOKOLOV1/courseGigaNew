package lesson3.lOperator;

public class Operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Логическое И (&&)
        System.out.println("a && b: " + (a && b)); // false

        // Логическое ИЛИ (||)
        System.out.println("a || b: " + (a || b)); // true

        // Логическое НЕ (!)
        System.out.println("!a: " + !a); // false
        System.out.println("!b: " + !b); // true

        // Логическое И (&), без короткого замыкания
        System.out.println("a & b: " + (a & b)); // false

        // Логическое ИЛИ (|), без короткого замыкания
        System.out.println("a | b: " + (a | b)); // true

        // Исключающее ИЛИ (^, XOR)
        System.out.println("a ^ b: " + (a ^ b)); // true

        // Пример с условием if и коротким замыканием
        int x = 5;
        if (x > 0 && x / x == 1) {
            System.out.println("Без ошибок");
        }

        // Еще один пример использования логических операторов
        int age = 20;
        boolean isStudent = true;

        if (age >= 18 && isStudent) {
            System.out.println("Вы совершеннолетний студент.");
        }
    }
}
