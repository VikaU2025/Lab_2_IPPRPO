import java.util.Scanner;

public class Polindrom {
    public static Boolean isPolindrom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите слово: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        if (word == null) {
            return false;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
