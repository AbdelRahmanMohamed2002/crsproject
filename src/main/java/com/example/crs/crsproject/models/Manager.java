package com.models;


public class Manager extends  Person implements Actions  
{

    public boolean EditOrderState()
    {
       return false; 
    }
   
    public void DailyReports()
    {

    }
    
    
    @Override
    public boolean ChangeCarStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ChangeCarStatus'");
    }
    @Override
    public void AddCar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AddCar'");
    }
    @Override
    public void RemoveCar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'RemoveCar'");
    }
}
 interface Actions
{
    public boolean EditOrderState();
    public boolean ChangeCarStatus();
    public void DailyReports();
    public void AddCar();
    public void RemoveCar();
}