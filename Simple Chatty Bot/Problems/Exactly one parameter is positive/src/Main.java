import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextInt() > 0;
        boolean b = sc.nextInt() > 0;
        boolean c = sc.nextInt() > 0;
        boolean allValid = a && b && c;
        System.out.println((a ^ b ^ c) && !allValid);
    }
}