import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int over = 0; //надлишок
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println(sum);
                break;
            }
            sum += number;
            if (sum >= 1000) {
                over = sum - 1000;
                System.out.println(over);
                break;
            }
        }
    }
}