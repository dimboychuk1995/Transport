package com;

/**
 * Created by us9522 on 28.01.2016.
 */
public class Plane extends Transport {

    public String name;
    public String color;

    public Plane(String type, String name, String color) {
        super(type);
        this.name = name;
        this.color = color;
    }

    public void function(){
        System.out.println("Plane flies");
    }

    public String toString(){
        return "Plane{ " +
                "type = " + type +
                " name = " + name +
                " color = " + color +
                "}";
    }
}
