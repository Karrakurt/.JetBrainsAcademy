import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder(new Scanner(System.in).nextLine());
        System.out.println(word.toString().equals(word.reverse().toString()) ? "yes" : "no");
    }
}
