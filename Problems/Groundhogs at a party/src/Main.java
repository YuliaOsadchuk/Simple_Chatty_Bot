import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        System.out.println((count >= 10 && count <= 20 && !weekend) || (count >= 15 && count <= 25 && weekend));
    }
}