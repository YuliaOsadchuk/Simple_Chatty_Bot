import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int countBribges = scanner.nextInt();
        for (int i = 1; i <= countBribges; i++) {
            if (bus >= scanner.nextInt()) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (i == countBribges) {
                System.out.println("Will not crash");
            }
        }
    }
}