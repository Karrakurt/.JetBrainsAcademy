import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int count = sc.nextInt() - 1, v; count >= 0; count--) {
            v = sc.nextInt();
            if (v < min) min = v;
        }
        System.out.println(min);
    }
}