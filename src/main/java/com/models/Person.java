package com.models;

public abstract class Person
{
    private String UserName;
    private String Password;
    private String Address;
    private int ID;

    public void Login(String UserName,String Password)
    {
       this.UserName=UserName;
       this.Password=Password; 
    }

    public void ChangePassword(String Password,String NewPassword)
    {
       if(this.Password==Password)
       {
        Password=NewPassword;
       }
    }

    public void EditUser(String UserName)
    {
       this.UserName=UserName;
    }
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }
}
