import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Выберите задание:\n 1.\tHello, World!\n2.\tКалькулятор двух чисел\n3.\tСумма чисел от 1 до N\n4.\tПроверка палиндрома\n0. Выход");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    HelloWorld.helloWorld();
                    break;
                case 2:
                    System.out.println(Calculator.canculate());
                    break;
                case 3:
                    Sum.sum();
                    break;
                case 4:
                    if (Polindrom.isPolindrom()){
                        System.out.println("палиндром");
                    }
                    else {
                        System.out.println("Не палиндром");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:

            }


        } while (n != 0);

    }
}
