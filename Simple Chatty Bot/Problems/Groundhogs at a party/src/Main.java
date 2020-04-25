import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cups = sc.nextInt();
        boolean isWeekend = sc.nextBoolean();
        boolean weekendCondition = isWeekend && cups >= 15 && cups <= 25;
        boolean notWeekendCondition = !isWeekend && cups >= 10 && cups <= 20;
        System.out.println(weekendCondition || notWeekendCondition);
    }
}