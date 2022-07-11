package com.zhoujc.LockSupport;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
class MyThread extends Thread {
    public void run() {
        synchronized (this) {
            System.out.println("before notify");
            notify();
            System.out.println("after notify");
        }
    }
}

public class WaitAndNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
//        myThread.start();
//        // 主线程睡眠3s
//        Thread.sleep(3000);
        synchronized (myThread) {
            myThread.start();
            // 主线程睡眠3s
            Thread.sleep(3000);
            try {
                System.out.println("before wait");
                // 阻塞主线程
                myThread.wait();
                System.out.println("after wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
