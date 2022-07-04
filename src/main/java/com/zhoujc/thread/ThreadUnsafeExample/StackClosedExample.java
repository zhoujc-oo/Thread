package com.zhoujc.thread.ThreadUnsafeExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class StackClosedExample {
    public static void main(String[] args) {
        StackClosedExampleClass example = new StackClosedExampleClass();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(() -> example.add100());
        executorService.execute(() -> example.add100());
        executorService.shutdown();
    }
}
