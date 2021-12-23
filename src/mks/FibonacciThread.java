package mks;

import java.math.BigInteger;

public class FibonacciThread extends Thread {
    private BigInteger a = BigInteger.valueOf(0);
    private BigInteger b = BigInteger.valueOf(1);

    public BigInteger getA() {
        return a;
    }

    public BigInteger getB() {
        return b;
    }

    @Override
    public void run() {
        BigInteger c;
        while (!Thread.currentThread().isInterrupted()) {
            c = a.add(b);
            a = b;
            b = c;
            System.out.println(a + " " + b);
        }
    }
}
