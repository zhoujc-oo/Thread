package com.zhoujc.thread.volatileTest;

/**
 * 直观上说，这段代码的结果只可能有两种：b=3;a=3 或 b=2;a=1。
 * 不过运行下面的代码(可能时间上要长一点)，就会发现除了上两种结果之外，还出现了第三种结果：b = 3; a = 1
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class VolatileTest {
    int a = 1;
    int b = 2;

    public void change() {
        a = 3;
        b = a;
    }

    public void print() {
        System.out.println("b=" + b + ";a=" + a);
    }

    public static void main(String[] args) {
        while (true) {
            final VolatileTest test = new VolatileTest();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.change();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.print();
                }
            }).start();
        }
    }
}
