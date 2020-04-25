package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        new GameRule(new User(), new User()).startGame();
//        new GameRule(new BotUser(), new User()).startGame();
//        new GameRule(new BotUser(), new BotUser()).startGame();
    }

    static class GameRule {
        private static Board board;
        private static final List<User> list = new ArrayList<>();

        public GameRule(User user1, User user2) {
            board = new Board(3, new Figure(null, ' '));
            user1.setFigure(new Figure(user1, 'X'));
            user2.setFigure(new Figure(user2, 'O'));
            list.addAll(Arrays.asList(user1, user2));
        }

        public void startGame() {
            Figure winner = null;
            for (int i = 0; board.getEmptyCellsCount() > 0 && winner == null; i = ++i % 2) {
                System.out.println(board);
                placeFigure(list.get(i));
                winner = getFigure();
            }
            System.out.println(board);
            System.out.println(winner == null ?
                    "Draw" : winner.getFigure() + " wins!");
        }

        private void placeFigure(User user) {
            if (!user.isBot())
                user.showMessage("enter the coordinates column and row");
            String col = user.getString();
            String row = user.getString();
            Figure f = null;
            Point p = null;
            if (col.matches("[123]") && row.matches("[123]"))
                f = board.getCell(p = new Point(Integer.parseInt(row) - 1,
                        Integer.parseInt(col) - 1));
            if (f != null)
                if (f.getOwner() == null)
                    if (board.setFigure(p, user.getFigure()))
                        return;
            if (!user.isBot())
                System.out.println("Enter is incorrect. Try again");
            placeFigure(user);
        }

        private Figure getFigure() {
            Figure winner = compareLine(compareLine(null,
                    board.getDiag(false)), board.getDiag(true));
            for (int i = 0; i < board.getSize() && winner == null; i++)
                winner = compareLine(compareLine(null, board.getRow(i)), board.getCol(i));
            return winner;
        }

        Figure compareLine(Figure prev, Figure[] line) {
            if (prev != null) return prev;
            boolean b = line[0].getOwner() != null;
            for (int i = 1; i < line.length && b; i++)
                b = line[i] == line[0];
            return b ? line[0] : null;
        }
    }

    static class Board {
        private final int size;
        private final Figure clearFigure;
        private final Figure[][] field;

        private int emptyCellsCount = 0;

        Board(int size, Figure clearFigure) {
            this.size = size;
            this.clearFigure = clearFigure;
            this.field = new Figure[size][size];
            clearField();
        }

        int getSize() {
            return size;
        }

        int getEmptyCellsCount() {
            return emptyCellsCount;
        }

        Figure getCell(Point p) {
            if (isPointCorrect(p))
                return field[p.row][p.col];
            return null;
        }

        Figure[] getRow(int row) {
            return field[row];
        }

        Figure[] getCol(int col) {
            Figure[] cols = new Figure[size];
            for (int i = 0; i < size; i++)
                cols[i] = field[i][col];
            return cols;
        }

        Figure[] getDiag(boolean left) {
            Figure[] diags = new Figure[size];
            int a = left ? 0 : size - 1;
            for (int i = 0; i < size; i++)
                diags[i] = field[Math.abs(i)][Math.abs(a - i)];
            return diags;
        }

        boolean setFigure(Point p, Figure f) {
            if (isPointCorrect(p) && emptyCellsCount > 0) {
                if (field[p.row][p.col].getOwner() == null)
                    emptyCellsCount--;
                field[p.row][p.col] = f;
                f.setFigureCount(f.getFigureCount());
                return true;
            }
            return false;
        }

        void clearField() {
            emptyCellsCount = size * size;
            for (Figure[] f : field)
                Arrays.fill(f, clearFigure);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(getBorder(size) + "\n");
            for (int i = field.length - 1; i >= 0; i--)
                sb.append(getRow(field[i])).append("\n");
            return sb.append(getBorder(size)).toString();
        }

        private String getRow(Figure[] figures) {
            StringBuilder sb = new StringBuilder("| ");
            for (Figure f : figures)
                sb.append(f).append(" ");
            return sb.append("|").toString();
        }

        private String getBorder(int count) {
            return "+" + "-".repeat(count * 3 - 2) + "+";
        }

        private boolean isPointCorrect(Point p) {
            if (p == null) return false;
            return p.row > -1 && p.row < size && p.col > -1 && p.col < size;
        }
    }

    static class User {
        private final Scanner sc = new Scanner(System.in);
        private final boolean isBot;
        private Figure figure;

        public User() {
            this(false);
        }

        protected User(boolean isBot) {
            this.isBot = isBot;
        }

        public boolean isBot() {
            return isBot;
        }

        public Figure getFigure() {
            return figure;
        }

        public void setFigure(Figure figure) {
            this.figure = figure;
        }

        public void showMessage(String s) {
            System.out.printf("[%s] %s: ", figure, s);
        }

        public String getString() {
            return sc.next();
        }
    }

    static class BotUser extends User {
        protected BotUser() {
            super(true);
        }

        @Override
        public String getString() {
            return "" + (int) (Math.random() * 3 + 1);
        }
    }

    static class Figure {
        private final User owner;
        private final char figure;
        private int figureCount = 0;

        public Figure(User owner, char figure) {
            this.owner = owner;
            this.figure = figure;
        }

        public int getFigureCount() {
            return figureCount;
        }

        public void setFigureCount(int figureCount) {
            this.figureCount = figureCount;
        }

        public char getFigure() {
            return figure;
        }

        public User getOwner() {
            return owner;
        }

        @Override
        public String toString() {
            return "" + figure;
        }
    }

    static class Point {
        public int row;
        public int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
