import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > arr[row][col]) {
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row + " " + col);
    }
}