package com.zhoujc.thread.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class LockExampleMaim {
    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> lockExample.func());
        executorService.execute(() -> lockExample.func());
    }
}
