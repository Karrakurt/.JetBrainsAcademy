import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(checkArray(getArray()));
    }

    static boolean checkArray(int[] a) {
        boolean isSorted = true;
        for (int i = 1; i < a.length; i++) {
            isSorted &= a[i - 1] < a[i];
        }
        return isSorted;
    }

    static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}