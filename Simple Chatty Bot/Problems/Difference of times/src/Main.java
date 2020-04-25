import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstMoment = sc.nextInt() * 60 * 60 + sc.nextInt() * 60 + sc.nextInt();
        int secondMoment = sc.nextInt() * 60 * 60 + sc.nextInt() * 60 + sc.nextInt();
        System.out.println(secondMoment - firstMoment);
    }
}