import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int partsToShip = 0;
        int partsToFix = 0;
        int partsToReject = 0;
        for (int i = 0, v; i < count; i++) {
            v = sc.nextInt();
            if (v < 0) {
                partsToReject++;
            } else if (v > 0) {
                partsToFix++;
            } else {
                partsToShip++;
            }
        }
        System.out.printf("%d %d %d\n", partsToShip, partsToFix, partsToReject);
    }
}