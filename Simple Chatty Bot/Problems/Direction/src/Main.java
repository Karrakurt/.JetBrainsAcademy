import java.util.Scanner;

class Main {
    private static String log(int dir) {
        switch (dir) {
            case 0:
                return "do not move";
            case 1:
                return "move up";
            case 2:
                return "move down";
            case 3:
                return "move left";
            case 4:
                return "move right";
            default:
                return "error!";
        }
    }

    public static void main(String[] args) {
        System.out.println(log(new Scanner(System.in).nextInt()));
    }
}