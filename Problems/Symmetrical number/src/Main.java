import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)) {
            System.out.println("1");
        } else {
            System.out.println(21);
        }
    }
}