import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int durInDays = sc.nextInt();
        int totalFoodCost = sc.nextInt() * durInDays;
        int totalFlyCost = sc.nextInt() * 2;
        int totalNightCost = sc.nextInt() * (durInDays - 1);
        System.out.println(totalFoodCost + totalFlyCost + totalNightCost);
    }
}