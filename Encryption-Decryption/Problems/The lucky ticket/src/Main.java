// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int sum = 0;
        for (int i = 0; i < 3; i++)
            sum += s.charAt(i) - s.charAt(i + 3);
        System.out.println(sum == 0 ? "Lucky" : "Regular");
    }
}