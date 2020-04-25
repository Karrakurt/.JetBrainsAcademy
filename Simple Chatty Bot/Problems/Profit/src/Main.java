import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        int years = 0;
        while (m < k) {
            m += m / 100 * p;
            years++;
        }
        System.out.println(years);
    }
}