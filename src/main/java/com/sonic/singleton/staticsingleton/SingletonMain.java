package com.sonic.singleton.staticsingleton;

/**
 * Create by Sonic on 2018/9/30
 */
public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }
        System.out.println("End.");
    }
}
