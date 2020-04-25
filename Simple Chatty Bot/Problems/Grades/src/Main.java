import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0, v; i < count; i++) {
            v = sc.nextInt();
            if (v == 2) {
                d++;
            } else if (v == 3) {
                c++;
            } else if (v == 4) {
                b++;
            } else if (v == 5) {
                a++;
            }
        }
        System.out.printf("%d %d %d %d\n", d, c, b, a);
    }
}