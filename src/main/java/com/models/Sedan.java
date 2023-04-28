package com.models;

public class Sedan extends Car {
    public  double  TrunkSize; 
    
    public Sedan(String brand, int pricePerDay, String color, int number_Of_Seats, String model, String car_Status,
            String truck_Size, String transmission) {
        super(brand, pricePerDay, color, number_Of_Seats, model, car_Status, truck_Size, transmission);
        //TODO Auto-generated constructor stub
    }
    
   

    @Override
    public void EditPricing(int PricePerDay) {
        // TODO Auto-generated method stub
        super.EditPricing(PricePerDay);
    }

    @Override
    public void editCar() {
        // TODO Auto-generated method stub
        super.editCar();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }

  
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    public double getTrunkSize() {
        return TrunkSize;
    }




    public void setTrunkSize(double trunkSize) {
        TrunkSize = trunkSize;
    }
    
}
