package com.zhoujc.thread.addSynchronized;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class SynchronizedObjectLock2 implements Runnable {
    static SynchronizedObjectLock2 instence = new SynchronizedObjectLock2();

    Object block1 = new Object();
    Object block2 = new Object();

    @Override
    public void run() {
        synchronized (block1) {
            System.out.println("block1锁，我是线程:" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("block1锁," + Thread.currentThread().getName() + "结束");
        }

        synchronized (block2) {
            System.out.println("block2锁，我是线程:" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("block2锁," + Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instence);
        Thread t2 = new Thread(instence);
        t1.start();
        t2.start();

    }
}