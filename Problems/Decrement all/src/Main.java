import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(scanner.nextInt());
        }
        for (Integer i : list) {
            System.out.print(--i + " ");
        }
    }
}