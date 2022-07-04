package com.zhoujc.thread.addSynchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class SynchronizedExample {
    public void func1() {
        synchronized (SynchronizedExample.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedExample e1 = new SynchronizedExample();
        SynchronizedExample e2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e2.func1());
    }
}
