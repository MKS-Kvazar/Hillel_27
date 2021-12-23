package mks;

public class PointTask implements Runnable {
    private final Point point;

    public PointTask(Point point) {
        this.point = point;
    }

    @Override
    public void run() {
//        point.movie(1,1);
//        point.movieS(1, 1);
//        point.movieLock(1,1);
//        Point.movieSS(point,1, 1);
        Point.movieLockS(point,1,1);
    }
}
