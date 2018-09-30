package com.sonic.prototype;

/**
 * Create by Sonic on 2018/9/30
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("string message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("string message");
        p1.use("Hello, World");
        Product p2 = manager.create("warning box");
        p2.use("Hello, World");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World");
    }
}
