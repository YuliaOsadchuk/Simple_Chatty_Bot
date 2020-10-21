import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        switch (s) {
            case "triangle": {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                double p = (a + b + c) / 2.0;
                double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(square);
                break;
            }
            case "rectangle": {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a * b);
                break;
            }
            case "circle": {
                int r = scanner.nextInt();
                System.out.println(r * r * 3.14);
                break;
            }
        }
    }
}