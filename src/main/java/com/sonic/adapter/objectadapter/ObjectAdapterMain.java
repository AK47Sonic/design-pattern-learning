package com.sonic.adapter.objectadapter;

/**
 * Create by Sonic on 2018/9/29
 */
public class ObjectAdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
