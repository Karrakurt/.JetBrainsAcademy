import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = sc.nextInt();
        for (int i = 0, v = 0; i < count; i++) {
            v = sc.nextInt();
            if (v % 4 == 0 && v > max) max = v;
        }
        System.out.println(max);
    }
}