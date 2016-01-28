package com;

/**
 * Created by us9522 on 28.01.2016.
 */
public class Yacht extends Transport {

    public String name;
    public String color;

    public Yacht(String type, String name, String color) {
        super(type);
        this.name = name;
        this.color = color;
    }

    public void function(){
        System.out.println("Yacht swiming");
    }

    public String toString(){
        return "Yacht{ " +
                "type = " + type +
                " name = " + name +
                " color = " + color +
                "}";
    }
}
