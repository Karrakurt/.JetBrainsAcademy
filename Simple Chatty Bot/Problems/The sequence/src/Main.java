import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = 0;
        while (count-- > 0) {
            int v = sc.nextInt();
            if (v % 4 == 0 && v > max) {
                max = v;
            }
        }
        System.out.println(max);
    }
}