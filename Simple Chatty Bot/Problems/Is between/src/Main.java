import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(val <= a && val >= b || val <= b && val >= a);
    }
}