package com.zhoujc.thread.volatileTest;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class Test {
    private volatile int a;
    public void update(){
        a = 1;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.update();
    }
}
