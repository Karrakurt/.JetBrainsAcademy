import java.util.Scanner;

class Main {
    private static final String S = "You have chosen a ";

    private static String f(int v) {
        switch (v) {
            case 1:
                return S + "square";
            case 2:
                return S + "circle";
            case 3:
                return S + "triangle";
            case 4:
                return S + "rhombus";
            default:
                return "There is no such shape!";
        }
    }

    public static void main(String[] args) {
        System.out.println(f(new Scanner(System.in).nextInt()));
    }
}