import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getCompareString(compare(getBox(), getBox())));
    }

    private static String getCompareString(int compareResult) {
        if (compareResult == 0) return "Box 1 = Box 2";
        if (compareResult < 0) return "Box 1 < Box 2";
        return compareResult % 10 == 0 ? "Box 1 > Box 2" : "Incomparable";
    }

    private static int compare(int[] box1, int[] box2) {
        int result = 0;
        for (int i = 0, v; i < 3; i++)
            result += (v = Integer.compare(box1[i], box2[i])) > 0 ? v * 10 : v;
//            v = Integer.compare(box1[i], box2[i]);
//            result += v > 0 ? v * 10 : v;
//        }
        return result;
    }

    private static int[] getBox() {
        int[] box = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(box);
        return box;
    }
}