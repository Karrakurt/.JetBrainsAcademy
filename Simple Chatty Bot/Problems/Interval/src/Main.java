import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        if (value > -15 && value <= 12 || value > 14 && value < 17 || value >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}