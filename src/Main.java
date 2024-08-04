//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
 import java.util.Random;

    public class Main {
    public static void main(String[] args) {
        // Вызов метода permission с различными входными данными
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = new Random().nextInt(51) - 20; // Температура от -20 до 30
            System.out.println("Age: " + age + ", Temperature: " + temperature + " -> " + permission(age, temperature));
        }
    }

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100); // Возраст от 0 до 99
    }
}