package com.models;


public  abstract class  Car
{
   private String Brand;
   private int PricePerDay;
   private  String Color;
   private int Number_Of_Seats;
   private  String Model;
   private String Car_Status;
   private String Truck_Size;
   private  String Transmission;

    public String getBrand() {
    return Brand;
}

public void setBrand(String brand) {
    Brand = brand;
}

public int getPricePerDay() {
    return PricePerDay;
}

public void setPricePerDay(int pricePerDay) {
    PricePerDay = pricePerDay;
}

public String getColor() {
    return Color;
}

public void setColor(String color) {
    Color = color;
}

public int getNumber_Of_Seats() {
    return Number_Of_Seats;
}

public void setNumber_Of_Seats(int number_Of_Seats) {
    Number_Of_Seats = number_Of_Seats;
}

public String getModel() {
    return Model;
}

public String getTransmission() {
    return Transmission;
}

public void setModel(String model) {
    Model = model;
}

public String getCar_Status() {
    return Car_Status;
}

public void setCar_Status(String car_Status) {
    Car_Status = car_Status;
}

public String getTruck_Size() {
    return Truck_Size;
}

public void setTruck_Size(String truck_Size) {
    Truck_Size = truck_Size;
}

  
    public Car(String brand, int pricePerDay, String color, int number_Of_Seats, String model, String car_Status,
        String truck_Size, String transmission) {
    Brand = brand;
    PricePerDay = pricePerDay;
    Color = color;
    Number_Of_Seats = number_Of_Seats;
    Model = model;
    Car_Status = car_Status;
    Truck_Size = truck_Size;
    Transmission = transmission;
}

    public void editCar()
    {

    }
    
    public void EditPricing(int PricePerDay)
    {

    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }
   
}