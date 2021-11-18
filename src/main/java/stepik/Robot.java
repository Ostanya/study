package stepik;

import java.lang.Math;
public class Robot {

    int x = 0;
    int y = 0;
    Direction direction = Direction.UP;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
        }
    }

    public void turnRight() {
        switch (getDirection()){
            default:
            case DOWN: direction = Direction.LEFT;
                break;
            case UP: direction = Direction.RIGHT;
                break;
            case RIGHT: direction = Direction.DOWN;
                break;
            case LEFT: direction = Direction.UP;
        }
    }

    public void turnLeft() {
        switch (getDirection()){
            default:
            case DOWN: direction = Direction.RIGHT;
                break;
            case UP: direction = Direction.LEFT;
                break;
            case RIGHT: direction = Direction.UP;
                break;
            case LEFT: direction = Direction.DOWN;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int lengthX = robot.getX();
        int lenghtY = robot.getY();

        Direction direction = (lenghtY > toY) ? Direction.DOWN : Direction.UP;
        while (robot.getDirection() != direction) robot.turnLeft();
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        direction = (lengthX > toX) ? Direction.LEFT : Direction.RIGHT;
        while (robot.getDirection() != direction) robot.turnLeft();
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 3, Direction.UP);
        moveRobot(robot, 3, 0);
        System.out.println(String.format("(%d, %d)", robot.getX(), robot.getY()));
        moveRobot(robot, 0, 3);
        System.out.println(String.format("(%d, %d)", robot.getX(), robot.getY()));
        moveRobot(robot, -3, 0);
        System.out.println(String.format("(%d, %d)", robot.getX(), robot.getY()));
        moveRobot(robot, 0, -3);
        System.out.println(String.format("(%d, %d)", robot.getX(), robot.getY()));
    }
}
