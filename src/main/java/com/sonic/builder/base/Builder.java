package com.sonic.builder.base;

/**
 * Create by Sonic on 2018/10/1
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String string);

    public abstract void makeItems(String[] items);

    public abstract void close();

}
