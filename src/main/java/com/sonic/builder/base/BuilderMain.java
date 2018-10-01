package com.sonic.builder.base;

/**
 * Create by Sonic on 2018/10/1
 */
public class BuilderMain {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }
}
