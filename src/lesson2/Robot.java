/** Это класс робот, он умеет отдававать текущее свое направление getDirection,
 *  Свою позицию по оси x getX и оси y getY, поворачивать налево turnLeft(), направо turnRight()
 *  и ходить вперед stepForward().
 */
package lesson2;

public class Robot {
    private int x ;
    private int y ;
    private Direction direction ;
    private String name;

    public Robot (int firstX, int firstY, Direction firstDirection,String name) {
        x = firstX;
        y = firstY;
        direction = firstDirection;
        this.name=name;
    }
    public String GetName() {
        return name;
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
        System.out.println(name+" повернул против часовой стрелки");
        switch (direction) {
            case UP:
                direction=Direction.LEFT;
                System.out.println(name+" повернул вверх -> налево");
                break;
            case LEFT:
                direction=Direction.DOWN;
                System.out.println(name+" повернул налево -> вниз");
                break;
            case DOWN:
                direction=Direction.RIGHT;
                System.out.println(name+" повернул вниз -> направо");
                break;
            case RIGHT:
                direction=Direction.UP;
                System.out.println(name+" повернул направо -> вверх");
                break;
        }
    }

    public void turnRight() {
        System.out.println(name+" повернул по часовой стрелке");
        switch (direction) {
            case DOWN:
                direction=Direction.LEFT;
                System.out.println(name+" повернул вниз -> налево");
                break;
            case UP:
                direction=Direction.RIGHT;
                System.out.println(name+" поверенул вверх -> направо");
                break;
            case LEFT:
                direction=Direction.UP;
                System.out.println(name+" поверенул налево -> вверх");
                break;
            case RIGHT:
                direction=Direction.DOWN;
                System.out.println(name+" поверенул направо -> вниз");
                break;
        }
    }

    public void stepForward() {
        System.out.println(name+" движется");
        switch (direction) {
            case UP:
                System.out.println(name+" движется вверх");
                y++;
                break;
            case RIGHT:
                System.out.println(name+" движеся направо");
                x++;
                break;
            case DOWN:
                System.out.println(name+" движется вниз");
                y--;
                break;
            case LEFT:
                System.out.println(name+" движется налево");
                x--;
                break;
        }
    }
}