import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, v;
        while ((v = sc.nextInt()) != 0)
            if (v > max) max = v;
        System.out.println(max);
    }
}