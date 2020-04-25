import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int counter = new Scanner(System.in).nextInt();
        int a = 1;
        int b = 0;
        while (counter-- > 0) {
            System.out.print(a + " ");
            if (++b >= a) {
                b = 0;
                a++;
            }
        }
    }
}