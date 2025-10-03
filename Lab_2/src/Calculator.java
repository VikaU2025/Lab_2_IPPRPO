import java.util.Scanner;

public class Calculator {
    public static void displayMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("КАЛЬКУЛЯТОР ДВУХ ЧИСЕЛ");
        System.out.println("=".repeat(40));
        System.out.println("1. Сложение (+)");
        System.out.println("2. Вычитание (-)");
        System.out.println("3. Умножение (*)");
        System.out.println("4. Деление (/)");
        System.out.println("0. Выход");
        System.out.println("=".repeat(40));
        System.out.print("Выберите операцию: ");
    }

    // Метод сложения
    public static double add(double a, double b) {
        return a + b;
    }

    // Метод вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль невозможно!");
        }
        return a / b;
    }

    public static String canculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор!");

        while (true) {
            displayMenu();
            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Выход из программы. До свидания!");
                break;
            }

            // Проверяем корректность выбора операции
            if (!choice.equals("1") && !choice.equals("2") &&
                    !choice.equals("3") && !choice.equals("4")) {
                System.out.println("Ошибка: Выберите операцию от 1 до 4 или 0 для выхода!");
                continue;
            }

            try {
                // Ввод чисел
                System.out.print("Введите первое число: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Введите второе число: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result;
                String operationName;
                String operationSymbol;

                // Выполнение выбранной операции
                switch (choice) {
                    case "1":
                        result = add(num1, num2);
                        operationName = "Сложение";
                        operationSymbol = "+";
                        break;
                    case "2":
                        result = subtract(num1, num2);
                        operationName = "Вычитание";
                        operationSymbol = "-";
                        break;
                    case "3":
                        result = multiply(num1, num2);
                        operationName = "Умножение";
                        operationSymbol = "*";
                        break;
                    case "4":
                        result = divide(num1, num2);
                        operationName = "Деление";
                        operationSymbol = "/";
                        break;
                    default:
                        result = 0;
                        operationName = "Неизвестная операция";
                        operationSymbol = "?";
                        break;
                }

                // Вывод результата
                return "\nРезультат" + result;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректные числа!");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
            }
        }

        scanner.close();
        return "";
    }

}
