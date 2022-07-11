package com.zhoujc;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class Test {
    private AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(new int[] {0, 0});
        System.out.println(array);
        System.out.println(array.compareAndSet(1,1,1));
        System.out.println(array);
    }
}
