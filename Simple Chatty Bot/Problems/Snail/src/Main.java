import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(1 + ((h - a) + ((a - b) - 1)) / (a - b));
        System.out.println((h - b - 1) / (a - b) + 1);
    }
}