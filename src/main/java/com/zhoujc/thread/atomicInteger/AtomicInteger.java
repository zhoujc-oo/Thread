package com.zhoujc.thread.atomicInteger;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class AtomicInteger implements Runnable{
    @Override
    public void run() {

    }


//    private AtomicInteger cnt = new AtomicInteger();

//    public void add() {
//        cnt.incrementAndGet();
//    }

//    public final int incrementAndGet() {
//        return AtomicInteger.getAndInt(this, valueOffset, 1) + 1;
//    }
//
//    public final int getAndInt(Object var1, long var2, int var4) {
//        int var5;
//        do {
//            var5 = this.getIntVolatile(var1, var2);
//        } while (!this.compareAndSwapInt(var1, var2, var5, var5 + var4));
//        return var5;
//    }
}
