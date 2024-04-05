package data;

import bank.Card;

public class Client {
    private String name;
    private String surName;
    private Card card;
    private String isClient;

    public Client(String name, String surName){
        this.name = name;
        this.surName = surName;
        card = new Card();
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getIsClient() {
        return isClient;
    }

    public void setIsClient(String isClient) {
        this.isClient = isClient;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
