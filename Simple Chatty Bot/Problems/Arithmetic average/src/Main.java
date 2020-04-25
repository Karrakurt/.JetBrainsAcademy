import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beg = sc.nextInt();
        int end = sc.nextInt();
        float averageValue = 0;
        int averageCount = 0;
        for (int i = beg; i <= end; i++) {
            if (i % 3 == 0) {
                averageValue += i;
                averageCount++;
            }
        }
        System.out.println(averageValue / averageCount);
    }
}