import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isPretty(getPattern()));
    }

    static char[][] getPattern() {
        char[][] m = new char[4][4];
        for (int i = 0; i < 4; i++) {
            m[i] = sc.next().toCharArray();
        }
        return m;
    }

    static boolean isBlockPretty(int r, int c, char[][] m) {
        return !(m[r][c] == m[r + 1][c] &&
                m[r][c] == m[r][c + 1] &&
                m[r][c] == m[r + 1][c + 1]);
    }

    static String isPretty(char[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m[i].length - 1; j++) {
                if (!isBlockPretty(i, j, m)) return "NO";
            }
        }
        return "YES";
    }
}