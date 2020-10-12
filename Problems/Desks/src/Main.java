import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        int sum = 0;

        for (Integer i : list) {
            if (i % 2 != 0) {
                sum += i / 2 + 1;
            } else {
                sum += i / 2;
            }
        }
        System.out.println(sum);
    }
}