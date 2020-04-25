import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(means(new Scanner(System.in).next().toLowerCase()));
    }

    static String means(String s) {
        switch (s) {
            case "gryffindor":
                return "bravery";
            case "hufflepuff":
                return "loyalty";
            case "slytherin":
                return "cunning";
            case "ravenclaw":
                return "intellect";
            default:
                return "not a valid house";
        }
    }
}