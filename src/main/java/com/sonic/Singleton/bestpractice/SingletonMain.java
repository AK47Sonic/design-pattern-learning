package com.sonic.Singleton.bestpractice;

/**
 * Create by Sonic on 2018/9/30
 */
public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start");
        EnumSingleton obj1 = EnumSingleton.SINGLETON;
        EnumSingleton obj2 = EnumSingleton.SINGLETON;
        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }
        System.out.println("End.");
    }
}
