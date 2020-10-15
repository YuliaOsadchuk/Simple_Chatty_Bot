import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int all = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < all; i++) {
            int a = scanner.nextInt();
            if (a % 4 == 0 && a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}