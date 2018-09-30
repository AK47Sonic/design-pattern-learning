package com.sonic.Singleton.staticsingleton;

/**
 * Create by Sonic on 2018/9/30
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    static {
        System.out.println("Init");
    }

    private Singleton() {
        System.out.println("Create a instance");
    }

    public static Singleton getInstance() {
        System.out.println("Run getInstance");
        return singleton;
    }
}
