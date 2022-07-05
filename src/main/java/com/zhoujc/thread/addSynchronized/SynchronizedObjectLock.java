package com.zhoujc.thread.addSynchronized;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class SynchronizedObjectLock implements Runnable {
    static SynchronizedObjectLock instance1 = new SynchronizedObjectLock();
//    static SynchronizedObjectLock instance2 = new SynchronizedObjectLock();

    @Override
    public void run() {
        synchronized (this) {
//        所有线程都用同意一把锁
//        synchronized (SynchronizedObjectLock.class) {
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance1);
        t1.start();
        t2.start();
    }
}