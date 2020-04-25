import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        int v;
        while ((v = sc.nextInt()) != 0) {
            if (v % 2 == 0) {
                s += "even\n";
            } else s += "odd\n";
        }
        System.out.print(s);
    }
}