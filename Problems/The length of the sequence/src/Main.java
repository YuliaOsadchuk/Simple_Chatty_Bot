import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int i = 0;
        do {
            number = scanner.nextInt();
            i++;
        } while (number != 0);
        System.out.println(i - 1);
    }
}