package com.sonic.prototype;

import java.util.HashMap;

/**
 * Create by Sonic on 2018/9/30
 */
public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        return p.createClone();
    }
}
