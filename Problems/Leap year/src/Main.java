import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (1900 <= number && number <= 3000 && ((number % 4 == 0
                && number % 100 != 0) || number % 400 == 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}