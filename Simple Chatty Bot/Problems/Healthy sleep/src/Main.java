import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int now = sc.nextInt();
        if (now < min) {
            System.out.println("Deficiency");
        } else if (now > max) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}