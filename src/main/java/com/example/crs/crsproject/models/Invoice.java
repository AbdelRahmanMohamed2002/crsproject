package com.models;

public class inventory {
    private int Number_Of_Sedan_Cars;
    private int Number_Of_SUV_Cars;
    private int Number_Of_MiniVan_Cars;
    private int Number_Of_PickUpTrucks_Cars;

    public int getNumber_Of_Sedan_Cars() {
        return Number_Of_Sedan_Cars;
    }

    public void setNumber_Of_Sedan_Cars(int number_Of_Sedan_Cars) {
        Number_Of_Sedan_Cars = number_Of_Sedan_Cars;
    }

    public int getNumber_Of_SUV_Cars() {
        return Number_Of_SUV_Cars;
    }

    public void setNumber_Of_SUV_Cars(int number_Of_SUV_Cars) {
        Number_Of_SUV_Cars = number_Of_SUV_Cars;
    }

    public int getNumber_Of_MiniVan_Cars() {
        return Number_Of_MiniVan_Cars;
    }

    public void setNumber_Of_MiniVan_Cars(int number_Of_MiniVan_Cars) {
        Number_Of_MiniVan_Cars = number_Of_MiniVan_Cars;
    }

    public int getNumber_Of_PickUpTrucks_Cars() {
        return Number_Of_PickUpTrucks_Cars;
    }

    public void setNumber_Of_PickUpTrucks_Cars(int number_Of_PickUpTrucks_Cars) {
        Number_Of_PickUpTrucks_Cars = number_Of_PickUpTrucks_Cars;
    }

    public inventory(int number_Of_Sedan_Cars, int number_Of_SUV_Cars, int number_Of_MiniVan_Cars,
            int number_Of_PickUpTrucks_Cars) {
        Number_Of_Sedan_Cars = number_Of_Sedan_Cars;
        Number_Of_SUV_Cars = number_Of_SUV_Cars;
        Number_Of_MiniVan_Cars = number_Of_MiniVan_Cars;
        Number_Of_PickUpTrucks_Cars = number_Of_PickUpTrucks_Cars;
    }

    public void Update_Inventory()
    {

    }
}
