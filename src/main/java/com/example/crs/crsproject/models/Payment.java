package com.models;

public class Payment {
    private CreditCard Card; 
    private double PaymentAmount;
    private boolean PaymentSuccessful;
    private Invoice invoice;
    public CreditCard getCard() {
        return Card;
    }
    public void setCard(CreditCard card) {
        Card = card;
    }
    public double getPaymentAmount() {
        return PaymentAmount;
    }
    public void setPaymentAmount(double paymentAmount) {
        PaymentAmount = paymentAmount;
    }
    public boolean isPaymentSuccessful() {
        return PaymentSuccessful;
    }
    public void setPaymentSuccessful(boolean paymentSuccessful) {
        PaymentSuccessful = paymentSuccessful;
    }
    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Payment(CreditCard card, double paymentAmount, boolean paymentSuccessful, Invoice invoice) {
        Card = card;
        PaymentAmount = paymentAmount;
        PaymentSuccessful = paymentSuccessful;
        this.invoice = invoice;
    }

}
