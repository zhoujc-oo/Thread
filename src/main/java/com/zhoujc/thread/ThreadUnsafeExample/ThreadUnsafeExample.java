package com.zhoujc.thread.ThreadUnsafeExample;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class ThreadUnsafeExample {
    private int cnt = 0;

    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}