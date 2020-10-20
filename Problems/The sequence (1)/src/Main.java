import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int j = 0;
        while (true) {
            if (j >= number) {
                break;
            }
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i + " ");
                j++;
                if (j >= number) {
                    break;
                }
            }
            i++;
        }
    }
}