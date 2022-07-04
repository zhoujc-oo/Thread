package com.zhoujc.thread.addSynchronized;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class SynchronizedObjectLock implements Runnable {
    static SynchronizedObjectLock instance = new SynchronizedObjectLock();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
    }
}