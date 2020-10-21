import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        boolean sequence = false;
        while (scanner.hasNext()) {
            int first = scanner.nextInt();//перший
            int number = scanner.nextInt();
            boolean decrease;//спадання

            if (first == 0 || number == 0) {
                sequence = false;
                break;
            }

            if (first > number) {
                decrease = true;
                sequence = true;
            } else {
                decrease = false;
            }

            while ((number = scanner.nextInt()) != 0) {
                if (first >= number && decrease == true || first <= number && decrease == false) {
                    first = number;
                    sequence = true;
                } else {
                    sequence = false;
                    break;
                }
            }
        }
        System.out.println(sequence);*/


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number;
        boolean decrease;//спадання
        boolean sequence = true; // послідовність
        while ((number = scanner.nextInt()) != 0) {
            list.add(number);
        }

        if (list.size() >= 2 && list.get(0) > list.get(1)) {
            decrease = true;
        } else {
            decrease = false;

        }

        for (int i = 2; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i) && decrease == true || list.get(i - 1) <= list.get(i) && decrease == false) {
                sequence = true;
            } else {
                sequence = false;
                break;
            }
        }
        System.out.println(sequence);

    }
}