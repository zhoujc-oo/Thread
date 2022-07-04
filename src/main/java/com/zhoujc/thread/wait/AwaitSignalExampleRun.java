package com.zhoujc.thread.wait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class AwaitSignalExampleRun {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        AwaitSignalExample example = new AwaitSignalExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }
}
