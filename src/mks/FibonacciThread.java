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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public FibonacciThread() {
        super();
    }

    public FibonacciThread(Runnable target) {
        super(target);
    }

    public FibonacciThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public FibonacciThread(String name) {
        super(name);
    }

    public FibonacciThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public FibonacciThread(Runnable target, String name) {
        super(target, name);
    }

    public FibonacciThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public FibonacciThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }

    @Override
    public boolean isInterrupted() {
        return super.isInterrupted();
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public ClassLoader getContextClassLoader() {
        return super.getContextClassLoader();
    }

    @Override
    public void setContextClassLoader(ClassLoader cl) {
        super.setContextClassLoader(cl);
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public State getState() {
        return super.getState();
    }

    @Override
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return super.getUncaughtExceptionHandler();
    }

    @Override
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
        super.setUncaughtExceptionHandler(eh);
    }
}
