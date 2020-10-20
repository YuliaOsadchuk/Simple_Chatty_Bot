import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt(); // гроші
        int p = scanner.nextInt(); //проценти
        int k = scanner.nextInt(); //скільки грошей в результаті
        int years = 0;
        while (m < k) {
            m += m * p / 100;
            years++;
        }
        System.out.println(years);
    }
}