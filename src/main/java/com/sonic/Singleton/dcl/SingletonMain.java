package com.sonic.Singleton.dcl;


/**
 * Create by Sonic on 2018/9/30
 */
public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start");
        DclSingleton obj1 = DclSingleton.getInstance();
        DclSingleton obj2 = DclSingleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }
        System.out.println("End.");
    }
}
