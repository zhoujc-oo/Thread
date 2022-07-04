package com.zhoujc.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class LockExample {
    private Lock lock = new ReentrantLock();
    public void func(){
        lock.lock();
        try{
            for(int i = 0; i < 10; i++){
                System.out.println(i + " ");
            }
        }finally {
            lock.unlock();
        }
    }
}
