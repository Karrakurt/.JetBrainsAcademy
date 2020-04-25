import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int b = sc.nextInt();
        for (long i = a + 1; i < b; i++) {
            a *= i;
        }
        System.out.println(a);
    }
}