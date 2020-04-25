import java.util.*;

public class Main {

    public static String[] reverse(String... words) {
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[words.length - i - 1] = words[i];
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
}