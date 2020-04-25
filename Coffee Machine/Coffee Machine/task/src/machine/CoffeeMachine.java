package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final int CUP_WATER = 200;
    private static final int CUP_MILK = 50;
    private static final int CUP_BEANS = 15;

    private static Scanner sc = new Scanner(System.in);
    private static int countWater = 0;
    private static int countMilk = 0;
    private static int countBeans = 0;

    private static int getValue(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }

    private static void setup() {
        countWater = getValue("Write how many ml of water the coffee machine has:");
        countMilk = getValue("Write how many ml of milk the coffee machine has:");
        countBeans = getValue("Write how many grams of coffee beans the coffee machine has:");
    }

    private static int getMaxCups() {
        return Math.min(Math.min(countWater / CUP_WATER, countMilk / CUP_MILK), countBeans / CUP_BEANS);
    }

    private static String test(int need, int max) {
        switch (Integer.compare(need, max)) {
            case -1:
                return "Yes, I can make that amount of coffee (and even " +
                        (max - need) + " more than that)";
            case 1:
                return "No, I can make only " + max + " cup(s) of coffee";
            default:
                return "Yes, I can make that amount of coffee";
        }
    }

    public static void main(String[] args) {
        setup();
        int cups = getValue("Write how many cups of coffee you will need:");
        System.out.println(test(cups, getMaxCups()));
    }
}
