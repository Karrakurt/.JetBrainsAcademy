import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int v = new Scanner(System.in).nextInt();
        int i = 1;
        while (i * i <= v) {
            System.out.println(i * i);
            i++;
        }
    }
}