import java.util.Scanner;

class Main {
    private static int calc(int amount) {
        return amount / 2 + amount % 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextInt()) + calc(sc.nextInt()) + calc(sc.nextInt()));
    }
}