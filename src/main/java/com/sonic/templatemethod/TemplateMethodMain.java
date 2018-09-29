package com.sonic.templatemethod;

/**
 * Create by Sonic on 2018/9/29
 */
public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello World");
        AbstractDisplay d3 = new StringDisplay("Success");
        d1.display();
        d2.display();
        d3.display();
    }
}
