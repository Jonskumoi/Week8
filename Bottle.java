package com.example.myapplication;

public class Bottle {
    private String BottleName;
    private String Brand;
    private double energy;
    private double price;
    private double size;

    public Bottle(){
        BottleName = "Pepsi Max";
        Brand = "Pepsi";
        energy = 0.4;
        price = 1.8;
        size = 0.5;
    }

    public Bottle(String Bottlename2, double price2, double size2){
        BottleName = Bottlename2;
        price = price2;
        size = size2;
    }

    public String getBrand(){
        return Brand;
    }
    public double getenergy(){
        return energy;
    }
    public double getPrice(){
        return price;
    }
    public double getSize(){
        return size;
    }

}


