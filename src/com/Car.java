package com;

/**
 * Created by us9522 on 28.01.2016.
 */
public class Car extends Transport {

    public String name;
    public String color;

    public Car(String type, String name, String color) {
        super(type);
        this.name = name;
        this.color = color;
    }



    public void function(){
        System.out.println("Car riding");
    }

    public String toString(){
        return "Car{ " +
                "type = " + type +
                " name = " + name +
                " color = " + color +
                "}";
    }
}
