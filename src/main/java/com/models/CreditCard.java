package com.models;

public class CreditCard {
    private String CardHolderName;
    private String Cardnumber;
    private int CVV;
    private String ExpiryDate;
    private Order ORD;
    public String getCardHolderName() {
        return CardHolderName;
    }
    public void setCardHolderName(String cardHolderName) {
        CardHolderName = cardHolderName;
    }
    public String getCardnumber() {
        return Cardnumber;
    }
    public void setCardnumber(String cardnumber) {
        Cardnumber = cardnumber;
    }
    public int getCVV() {
        return CVV;
    }
    public void setCVV(int cVV) {
        CVV = cVV;
    }
    public String getExpiryDate() {
        return ExpiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }
    public Order getORD() {
        return ORD;
    }
    public void setORD(Order oRD) {
        ORD = oRD;
    }

}
