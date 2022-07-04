package com.zhoujc.thread.wait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class WaitNotifyExampleRun {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();

        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }

}
