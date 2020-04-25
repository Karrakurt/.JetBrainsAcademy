//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        int number = 12241;
//        int digit = ((number % 100) / 10) % 10;
        int digit = (number % 100) / 10;
        System.out.println(digit);
    }
}