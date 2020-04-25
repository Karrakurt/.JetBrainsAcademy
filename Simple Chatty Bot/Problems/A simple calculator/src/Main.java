import java.util.Scanner;

class Main {
    private static String calc(long a, String o, long b) {
        switch (o) {
            case "+":
                return "" + (a + b);
            case "-":
                return "" + (a - b);
            case "*":
                return "" + (a * b);
            case "/": {
                if (b == 0) return "Division by 0!";
                return "" + (a / b);
            }
            default:
                return "Unknown operator";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextLong(), sc.next(), sc.nextLong()));
    }
}