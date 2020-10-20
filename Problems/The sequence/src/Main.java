import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int all = scanner.nextInt();
        int number;
        int max = 0;
        for (int i = 0; i < all; i++) {
            number = scanner.nextInt();
            if (number > max && number % 4 == 0) {
                max = number;
            }
        }
        System.out.println(max);
    }
}