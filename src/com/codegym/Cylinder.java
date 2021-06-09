package com.codegym;

public class Cylinder extends Circle {
    double heigth;

    public Cylinder() {

    }

    public Cylinder(double heigth) {
        this.heigth = heigth;
    }

    public Cylinder(double heigth, double radius, String color) {
        super(radius, color);
        this.heigth = heigth;
    }
    public double getHeigth(){
        return this.heigth;
    }
    public void setHeigth(double heigth){
       this.heigth =heigth;
    }
    public double getVolume(){
        return Math.PI*Math.pow(radius,2)*heigth;
    }
    public String toString(){
        return "status Cylinder:"
                +" Radius: "
                + getRadius()
                +" Area:"
                +getArea()
                + " color: "
                + getColor()
                +" height: "
                + getHeigth()
                + " vulume: "
                + getVolume();
    }
}
