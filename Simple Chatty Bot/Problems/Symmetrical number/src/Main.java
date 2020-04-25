import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        if (value / 1000 + value / 100 % 10 * 10 == value % 100) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}