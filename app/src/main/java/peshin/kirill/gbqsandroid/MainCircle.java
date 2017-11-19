package peshin.kirill.gbqsandroid;

public class MainCircle {
    public static final int INIT_RADIUS = 50;
    private int x, y, radius;

    public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        radius = INIT_RADIUS;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}
