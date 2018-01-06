package com.brevitaz;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller();
        seller.setName("FlipKart");

        Customer customer = new Customer();
        customer.putOrder();
    }

}
