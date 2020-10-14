import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //потрібно спати
        int b = scanner.nextInt(); // пересип
        int h = scanner.nextInt(); // скільки спить

        if (a <= h && h <= b) {
            System.out.println("Normal");
        } else if (a > h) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}