import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, sum = 0;
        while ((v = sc.nextInt()) != 0)
            sum += v;
        System.out.println(sum);
    }
}