import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String result = "NO";

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) { //по горизонталі
            list.add(i * m);
        }

        for (int i = 1; i < m + 1; i++) { //по вертикалі
            list.add(i * n);
        }

        for (int i : list) {
            if (i == k) {
                result = "YES";
            }
        }

        System.out.println(result);
    }
}