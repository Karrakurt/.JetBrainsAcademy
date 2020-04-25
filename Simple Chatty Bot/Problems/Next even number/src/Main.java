import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt() + 1;
        System.out.println(i + i % 2);
    }
}