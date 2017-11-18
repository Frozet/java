

public class Robot {
    int x, y;
    Direction direction;
    Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public Direction getDirection() {
        return direction;

    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        // текущая координата Y
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
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

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case LEFT:
                direction = Direction.UP;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        if (direction == Direction.DOWN){
            this.y--;
        }
        if (direction == Direction.UP){
            this.y++;
        }
        if (direction == Direction.LEFT){
            this.x--;
        }
        if (direction == Direction.RIGHT){
            this.x++;
        }
    }

    public void move(int toX, int toY) {
        if (toX == this.x && toY == this.y)
            return;
        if (toX < this.x) {
            while (this.direction != Direction.LEFT)
                turnLeft();
            while (this.x !=toX)
                stepForward();
        } else {
            while (this.direction != Direction.RIGHT)
                turnLeft();
            while (this.x != toX)
                stepForward();
        }
        if (toY < this.y) {
            while (this.direction != Direction.DOWN)
                turnLeft();
            while (this.y != toY)
                stepForward();
        } else {
            while (this.direction != Direction.UP)
                turnLeft();
            while (this.y != toY)
                stepForward();
        }
    }
}
