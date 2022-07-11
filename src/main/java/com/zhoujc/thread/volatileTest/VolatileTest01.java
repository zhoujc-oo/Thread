package com.zhoujc.thread.volatileTest;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class VolatileTest01 {
    volatile int i;

    public synchronized void addI() {
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        final VolatileTest01 test01 = new VolatileTest01();
        for (int n = 0; n < 1000; n++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        test01.addI();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(test01.i);
    }
}
