import java.util.Scanner;

class Main {
    private static final int BARRIER = 1000;
    private static int sum = 0;

    private static boolean test(int v) {
        if (v == 0) return false;
        return (sum += v) < BARRIER;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (test(sc.nextInt())) ;
        System.out.println(sum < BARRIER ? sum : sum - BARRIER);
    }
}