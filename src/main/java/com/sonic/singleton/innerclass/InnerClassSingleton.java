package com.sonic.singleton.innerclass;

/**
 * Create by Sonic on 2018/9/30
 */
public class InnerClassSingleton {

    private static class NestedClass {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return NestedClass.instance;
    }
}
