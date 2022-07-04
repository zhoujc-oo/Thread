package com.zhoujc.thread.addSynchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class NotSynchronizedExample {
    public void func1() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        NotSynchronizedExample e1 = new NotSynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e1.func1());
    }
}

