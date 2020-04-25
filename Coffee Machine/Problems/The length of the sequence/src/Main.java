import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.nextInt() != 0) count++;
        System.out.println(count);
    }
}