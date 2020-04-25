class Main {
    public static void main(String[] args) {

    }

    static Direction getDir(int diffX, int diffY) {
        if (diffX != 0) return diffX < 0 ? Direction.RIGHT : Direction.LEFT;
        else if (diffY != 0) return diffY < 0 ? Direction.UP : Direction.DOWN;
        return null;
    }

    static boolean rotate(Robot r, Direction d) {
        if (d == null) return false;
        if (r.getDirection() != d) {
            r.turnLeft();
            rotate(r, d);
        }
        return true;
    }

    public static void m(Robot robot, int toX, int toY) {
        while (rotate(robot, getDir(toX - robot.getX(),
                toY - robot.getY())))
            robot.stepForward();
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int diffX;
        int diffY;
        Direction dir;
        while ((diffX = Integer.compare(robot.getX(), toX)) != 0 |
                (diffY = Integer.compare(robot.getY(), toY)) != 0) {

            if (diffX != 0) dir = diffX < 0 ? Direction.RIGHT : Direction.LEFT;
            else dir = diffY < 0 ? Direction.UP : Direction.DOWN;

            if (robot.getDirection() == dir) robot.stepForward();
            else robot.turnLeft();
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public class Robot {

        public Direction getDirection() {
            // current direction
            return null;
        }

        public int getX() {
            // current X coordinate
            return 0;
        }

        public int getY() {
            // current Y o
            return 0;
        }

        public void turnLeft() {
            // rotate the robot 90 degrees counterclockwise
        }

        public void turnRight() {
            // rotate the robot 90 degrees clockwise
        }

        public void stepForward() {
            // take one step in the current direction
            // x or y coordinate will be changed by 1
        }
    }
}