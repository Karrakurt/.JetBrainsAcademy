import java.util.Arrays;

/* Please, do not rename it */
class Problem {
    public static void main(String[] args) {
        String operator = args[0];
        int[] array = new int[args.length - 1];
        for (int i = 1; i < args.length; i++)
            array[i - 1] = Integer.parseInt(args[i]);
        System.out.println(calc(operator, array));
    }

    static int calc(String operator, int[] array) {
        Arrays.sort(array);
        switch (operator) {
            case "MAX":
                return array[array.length - 1];
            case "MIN":
                return array[0];
            default: {
                int sum = 0;
                for (int i : array)
                    sum += i;
                return sum;
            }
        }
    }
}