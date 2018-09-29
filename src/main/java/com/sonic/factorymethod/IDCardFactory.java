package com.sonic.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Sonic on 2018/9/30
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected void registerProduct(Product p) {
        System.out.println("Register");
        owners.add(((IDCard) p).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        System.out.println("Create " + owner);
        return new IDCard(owner);
    }

    public List getOwners() {
        return owners;
    }
}
