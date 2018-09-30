package com.sonic.Singleton.innerclass;

import com.sonic.Singleton.dcl.DclSingleton;

/**
 * Create by Sonic on 2018/9/30
 */
public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start");
        InnerClassSingleton obj1 = InnerClassSingleton.getInstance();
        InnerClassSingleton obj2 = InnerClassSingleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }
        System.out.println("End.");
    }
}
