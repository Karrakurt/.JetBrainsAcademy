import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        System.out.println(i / 100 + i / 10 % 10 * 10 + i % 10 * 100);
    }
}