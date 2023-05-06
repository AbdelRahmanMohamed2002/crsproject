package com.models;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
public class Order extends Extrafees {
    private int orderID;
    private double price;
    private Car orderedCar;
    private LocalDate StartTime;
    private LocalDate EndTime;
    private String OrderStatus;
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Car getOrderedCar() {
        return orderedCar;
    }
    public void setOrderedCar(Car orderedCar) {
        this.orderedCar = orderedCar;
    }
    public LocalDate getStartTime() {
        return StartTime;
    }
    public void setStartTime(LocalDate startTime) {
        StartTime = startTime;
    }
    public LocalDate getEndTime() {
        return EndTime;
    }
    public void setEndTime(LocalDate endTime) {
        EndTime = endTime;
    }
    public String getOrderStatus() {
        return OrderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }
    // not finished
    public Order(int orderID, double price, Car orderedCar, LocalDate startTime, LocalDate endTime,
            String orderStatus) {
        this.orderID = orderID;
        this.price = price;
        this.orderedCar = orderedCar;
        StartTime = startTime;
        EndTime = endTime;
        OrderStatus = orderStatus;
    }
    
}
