import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = sc.nextInt();
        System.out.println(getLavish(getArray(count), getArray(count)));
    }

    static int getLavish(int[] incomes, int[] taxes) {
        int index = 0;
        for (int i = 1; i < incomes.length; i++) {
            if (((double)incomes[i] / 100) * taxes[i] > ((double)incomes[index] / 100) * taxes[index])
                index = i;
        }
        return index + 1;
    }

    static int[] getArray(int count) {
        int[] a = new int[count];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}