package com.sonic.adapter.classadapter;

/**
 * Create by Sonic on 2018/9/29
 */
public class ClassAdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
