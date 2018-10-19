/** Это класс робот, он умеет отдававать текущее свое направление getDirection,
 *  Свою позицию по оси x getX и оси y getY, поворачивать налево turnLeft(), направо turnRight()
 *  и ходить вперед stepForward().
 */
package lesson2;

public class Robot {
    private int x ;
    private int y ;
    private Direction direction ;

    public Robot (int firstX, int firstY, Direction firstDirection) {
        x = firstX;
        y = firstY;
        direction = firstDirection;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        switch (direction) {
            case UP:
                direction=Direction.LEFT;
                System.out.println("Вверх -> налево");
                break;
            case LEFT:
                direction=Direction.DOWN;
                System.out.println("Налево -> вниз");
                break;
            case DOWN:
                direction=Direction.RIGHT;
                System.out.println("Вниз -> направо");
                break;
            case RIGHT:
                direction=Direction.UP;
                System.out.println("Направо -> вверх");
                break;
        }
    }

    public void turnRight() {
        System.out.println("Поворот по часовой стрелке");
        switch (direction) {
            case DOWN:
                direction=Direction.LEFT;
                System.out.println("Вниз -> налево");
                break;
            case UP:
                direction=Direction.RIGHT;
                System.out.println("Вверх -> направо");
                break;
            case LEFT:
                direction=Direction.UP;
                System.out.println("Налево -> вверх");
                break;
            case RIGHT:
                direction=Direction.DOWN;
                System.out.println("Направо -> вниз");
                break;
        }
    }

    public void stepForward() {
        System.out.println("Движение");
        switch (direction) {
            case UP:
                System.out.println("Вверх");
                y++;
                break;
            case RIGHT:
                System.out.println("Направо");
                x++;
                break;
            case DOWN:
                System.out.println("Вниз");
                y--;
                break;
            case LEFT:
                System.out.println("Налево");
                x--;
                break;
        }
    }
}