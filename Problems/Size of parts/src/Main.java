import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int perfect = 0;
        int larger = 0;
        int smaller = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 0) {
                perfect++;
            } else if (a == 1) {
                larger++;
            } else {
                smaller++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}