package com.sonic.builder.chaining;

/**
 * Create by Sonic on 2018/10/1
 */
public class PersonBuilderMain {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("Sonic").age(18).sex(true).build();
        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.isSex());
    }
}
