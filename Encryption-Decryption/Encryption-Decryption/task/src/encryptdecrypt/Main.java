package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(crypt(sc.nextLine(), sc.nextLine().toCharArray(), sc.nextInt()));
    }

    static String crypt(String mult, char[] s, int key) {
        key *= mult.equals("enc") ? 1 : mult.equals("dec") ? -1 : 0;
        for (int i = 0; i < s.length; i++)
            s[i] = (char) (s[i] + key % 0xFFFF);
        return String.valueOf(s);
    }
}