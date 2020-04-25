import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean asc = true;
        boolean des = true;
        int last = sc.nextInt();
        int v;
        while ((v = sc.nextInt()) != 0 && (asc || des)) {
            asc &= last <= v;
            des &= last >= v;
            last = v;
        }
        System.out.println(asc || des);
    }
}