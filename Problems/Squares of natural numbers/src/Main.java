import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;
        int squares = 1;
        while (number >= squares) {
            System.out.println(squares);
            squares = i * i;
            i++;
        }
    }
}