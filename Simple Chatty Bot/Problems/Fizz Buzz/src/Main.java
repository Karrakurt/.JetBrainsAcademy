import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s;
        for (; a <= b; a++) {
            s = "";
            if (a % 3 == 0) s = "Fizz";
            if (a % 5 == 0) s += "Buzz";
            if (s.length() == 0) s = String.valueOf(a);
            System.out.println(s);
        }
    }
}