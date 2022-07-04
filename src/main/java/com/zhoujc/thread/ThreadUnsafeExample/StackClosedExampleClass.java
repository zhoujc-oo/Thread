package com.zhoujc.thread.ThreadUnsafeExample;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class StackClosedExampleClass {
    public void add100() {

        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
