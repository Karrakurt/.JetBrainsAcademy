class Problem {
    public static void main(String[] args) {
        System.out.println(calc(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }

    static String calc(String oper, int var1, int var2) {
        switch (oper) {
            case "+": return var1 + var2 + "";
            case "-": return var1 - var2 + "";
            case "*": return var1 * var2 + "";
            default: return "Unknown operator";
        }
    }
}