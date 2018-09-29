package com.sonic.factorymethod;

/**
 * Create by Sonic on 2018/9/30
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("Make " + owner + " ID card.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use " + owner + " ID card.");
    }

    public String getOwner() {
        return owner;
    }
}
