package com.sonic.builder.base;

/**
 * Create by Sonic on 2018/10/1
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("From morning to afternoon");
        builder.makeItems(new String[]{"morning", "afternoon"});
        builder.makeString("night");
        builder.close();
    }
}
