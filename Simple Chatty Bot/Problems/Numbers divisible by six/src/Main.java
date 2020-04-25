import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0, v; i < count; i++) {
            v = sc.nextInt();
            if (v % 6 == 0) {
                sum += v;
            }
        }
        System.out.println(sum);
    }
}