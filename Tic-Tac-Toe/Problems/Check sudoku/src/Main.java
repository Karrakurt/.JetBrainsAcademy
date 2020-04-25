import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isSudokuSolved(sc.nextInt()) ? "YES" : "NO");
    }

    private static boolean isSudokuSolved(int root) {
        int[][] m = getMatrix(root);
        boolean result = true;
        for (int i = 0; i < m.length && result; i++) {
            result = isColumnSolved(m, i) && isLineSolved(m[i]);
            if (i % root == 0) result &= isSquareSolved(m, i / root, root);
        }
        return result;
    }

    private static boolean isLineSolved(int[] line) {
        int[] sorted = line.clone();
        Arrays.sort(sorted);
        boolean result = sorted[0] == 1;
        for (int i = 1; i < sorted.length && result; i++)
            result = sorted[i] - sorted[i - 1] == 1;
        return result;
    }

    private static boolean isColumnSolved(int[][] m, int index) {
        int[] column = new int[m.length];
        for (int i = 0; i < m.length; i++)
            column[i] = m[i][index];
        return isLineSolved(column);
    }

    private static boolean isSquareSolved(int[][] m, int index, int root) {
        int[] square = new int[m.length];
        int counter = 0;
        for (int i = index * root; i < index * root + root; i++)
            for (int j = index * root; j < index * root + root; j++)
                square[counter++] = m[i][j];
        return isLineSolved(square);
    }

    static int[][] getMatrix(int root) {
        int[][] m = new int[root * root][root * root];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m.length; j++)
                m[i][j] = sc.nextInt();
        return m;
    }
}