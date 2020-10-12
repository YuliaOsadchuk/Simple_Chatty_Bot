import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean result = s.toLowerCase().startsWith("j") ? true : false;
        System.out.println(result);
    }
}