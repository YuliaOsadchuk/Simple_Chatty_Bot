import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean finish = false;
        int heightDay = 0;
        int day = 0;

        while (!finish) {
            heightDay += a;
            day++;
            if (heightDay >= h) {
                finish = true;
            } else {
                heightDay -= b;
            }
        }

        System.out.println(day);
    }
}