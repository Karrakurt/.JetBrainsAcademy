import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int v = new Scanner(System.in).nextInt();
        while (v != 1) {
            System.out.print(v + " ");
            if (v % 2 == 0) {
                v /= 2;
            } else {
                v = v * 3 + 1;
            }
        }
        System.out.println(v);
    }
}