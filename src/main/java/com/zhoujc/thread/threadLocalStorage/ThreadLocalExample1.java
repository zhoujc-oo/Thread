package com.zhoujc.thread.threadLocalStorage;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class ThreadLocalExample1 {
    public static void main(String[] args) {
        ThreadLocal threadLocal1 = new ThreadLocal();
        ThreadLocal threadLocal2 = new ThreadLocal();
        Thread thread1 = new Thread(()->{
            threadLocal1.set(1);
            threadLocal2.set(1);
        });
        Thread thread2 = new Thread(()->{
            threadLocal1.set(2);
            threadLocal2.set(2);
        });
        thread1.start();
        thread2.start();
    }
}
