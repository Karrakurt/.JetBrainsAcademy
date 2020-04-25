import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String max = "";
        for (String s : new Scanner(System.in).nextLine().split(" "))
            max = max.length() < s.length() ? s : max;
        System.out.println(max);
    }
}