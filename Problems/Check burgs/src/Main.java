import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean result = s.toLowerCase().endsWith("burg") ? true : false;
        System.out.println(result);
    }
}