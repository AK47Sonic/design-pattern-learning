package com.sonic.Singleton.dcl;

/**
 * Create by Sonic on 2018/9/30
 */
public class DclSingleton {
    /**
     *  volatile 防止指令重排序
     */
    private static volatile DclSingleton instance = null;

    private DclSingleton() {

    }

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }

}
