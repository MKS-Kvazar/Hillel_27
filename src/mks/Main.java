package mks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        new Main().Task_1();
        new Main().Task_2();
        new Main().Task_3();
    }

    private void Task_1() {
//        Все варианты мониторов synchronized закоментированы в классе 'PointTask'
        Point point = new Point(0, 0);
        ExecutorService service = Executors.newFixedThreadPool(2000);
        List<Future<?>> array = new ArrayList<>();
        for (int index = 0; index < 2000; index++) {
            Future<?> future = service.submit(new PointTask(point));
            array.add(future);
        }
        try {
            for (Future<?> future : array) {
                future.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
    }

    private void Task_2() {
        FibonacciThread thread = new FibonacciThread();
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(3);
            thread.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("a = " + thread.getA());
        System.out.println("b = " + thread.getB());
    }

    private void Task_3() {
        FibonacciRunnable task = new FibonacciRunnable();
        Thread thread = new Thread(task);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(3);
            thread.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("a = " + task.getA());
        System.out.println("b = " + task.getB());
    }
}
