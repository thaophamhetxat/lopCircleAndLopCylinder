package com.codegym;

public class Main {

    public static void main(String[] args) {
        //circle
	Circle circle = new Circle(5,"RED");
        System.out.println("ban kinh r= "+circle.getRadius());
        System.out.println("color: "+circle.getColor());
        System.out.println("dien tich hinh tron: S= "+circle.getArea());

        Cylinder cylinder = new Cylinder(6);
//        System.out.println(cylinder);
//
//        cylinder = new Cylinder(3.5);
//        System.out.println(cylinder);

       cylinder = new Cylinder(3.5, 5, "origin");
        System.out.println(cylinder);



    }
}
