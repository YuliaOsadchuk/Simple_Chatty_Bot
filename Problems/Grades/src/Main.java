import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allGrades = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < allGrades; i++) {
            int grades = scanner.nextInt();
            if (grades == 5) {
                a++;
            } else if (grades == 4) {
                b++;
            } else if (grades == 3) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}