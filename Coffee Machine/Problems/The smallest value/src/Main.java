// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long fact = 1, counter = 1,
                m = new Scanner(System.in).nextLong();
        while ((fact *= ++counter) <= m);
        System.out.println(counter);
    }
}