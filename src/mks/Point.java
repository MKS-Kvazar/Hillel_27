package mks;

public class Point {
    private final Object lock = new Object();
    private static final Object lockStatic = new Object();
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void movie(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public synchronized void movieS(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void movieLock(int dx, int dy) {
        synchronized (lock) {
            x += dx;
            y += dy;
        }
    }

    public static synchronized void movieSS(Point point, int dx, int dy) {
        point.x += dx;
        point.y += dy;
    }

    public static void movieLockS(Point point, int dx, int dy) {
        synchronized (lockStatic) {
            point.x += dx;
            point.y += dy;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
