package com.itlize.codinghomework1.entity;

public class CreditCard {
    private String cardNumber;

    public CreditCard() {
    }

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
