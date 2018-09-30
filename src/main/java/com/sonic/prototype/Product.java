package com.sonic.prototype;

/**
 * Create by Sonic on 2018/9/30
 */
public interface Product extends Cloneable{
    void use(String s);

    Product createClone();
}
