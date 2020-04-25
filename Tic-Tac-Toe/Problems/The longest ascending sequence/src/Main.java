import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt() - 1, max = 1;
        for (int prev = sc.nextInt(), counter = 1, v; count > 0; count--) {
            v = sc.nextInt();
            if (prev < v) counter++;
            else {
                counter = 1;
                prev = 0;
            }
            prev = v;
            max = Math.max(max, counter);
        }
        System.out.println(max);
    }
}