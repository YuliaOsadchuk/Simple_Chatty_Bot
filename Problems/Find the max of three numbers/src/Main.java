import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int max = a;
        int maxNum = 1;
        if (max < b) {
            max = b;
            maxNum = 2;
        }
        if (max < c) {
            maxNum = 3;
        }
        return maxNum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}