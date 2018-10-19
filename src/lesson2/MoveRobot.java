/**Класс MoveRobot в котором есть метод moveRobot, который приводит робота
 * из текущей точки X и Y в заданую позицию toX и ToY
 *
 */

package lesson2;

public class MoveRobot {
    public void start() {
        Robot robot=new Robot(0,0,Direction.UP);
        moveRobot(robot,5,5);
    }
    public void moveRobot(Robot robot,int toX,int toY) {
        int x;
        int y;
        Direction nowDirection;
        nowDirection=robot.getDirection();
        x=robot.getX();
        y=robot.getY();
        if (x>toX) {
            while (!nowDirection.equals(Direction.LEFT)) {
                robot.turnLeft();
                nowDirection=robot.getDirection();
            }
            while (x!=toX) {
                robot.stepForward();
                x=robot.getX();
            }
        }
        else if (x<toX) {
            while (!nowDirection.equals(Direction.RIGHT)) {
                robot.turnRight();
                nowDirection=robot.getDirection();
            }
            while (x!=toX) {
                robot.stepForward();
                x=robot.getX();
            }
        }
        if (y>toY) {
            while (!nowDirection.equals(Direction.DOWN)) {
                robot.turnLeft();
                nowDirection=robot.getDirection();
            }
            while (y!=toY) {
                robot.stepForward();
                y=robot.getY();
            }
        }
        else if (y<toY) {
            while (!nowDirection.equals(Direction.UP)) {
                robot.turnRight();
                nowDirection=robot.getDirection();
            }
            while (y!=toY) {
                robot.stepForward();
                y=robot.getY();
            }

        }
    }
}
