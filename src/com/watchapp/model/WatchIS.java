package com.watchapp.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Santoshi Paudel LMU ID: 23048656
 */
public class WatchIS {

    private int SerialNumber;
    private int ModelNumber;
    private String Name;
    private String Brand;
    private double Price;
    private String Warranty;

    //constructor for initialization of variables
    public WatchIS(int SerialNumber, int ModelNumber, String Name, String Brand, double Price, String Warranty) {
        this.SerialNumber = SerialNumber;
        this.ModelNumber = ModelNumber;
        this.Name = Name;
        this.Brand = Brand;
        this.Price = Price;
        this.Warranty = Warranty;
    }
    // getter and setter method to get and set the values

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public int getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(int ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getWarranty() {
        return Warranty;
    }

    public void setWarranty(String Warranty) {
        this.Warranty = Warranty;
    }

}
