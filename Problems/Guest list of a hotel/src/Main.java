//put imports you need here

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            list.add(0, scanner.next());
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}