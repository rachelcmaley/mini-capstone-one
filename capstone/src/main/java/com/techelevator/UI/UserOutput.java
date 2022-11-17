package com.techelevator.UI;

import com.techelevator.models.Inventory;
import com.techelevator.models.Purchase;
import com.techelevator.models.products.Product;

public class UserOutput {

    public static void displayWelcomeScreen(){

        System.out.println();
        System.out.println("*************************");
        System.out.println("Welcome to Vend-Matic 800");
        System.out.println("*************************");
    }

    public static void displayHomeScreenMenu(){
        System.out.println();
        System.out.println("*********************");
        System.out.println("Main Home Screen");
        System.out.println("*********************");
        System.out.println();
        System.out.println("1) Display Vending Machine Items");
        System.out.println("2) Purchase");
        System.out.println("3) Exit");
        System.out.println();
    }

    public static void displayInventory(Inventory inventory){
        System.out.println();
        System.out.println("*********************");
        System.out.println("Products");
        System.out.println("*********************");
        System.out.println();

        for (Product product : inventory.getProducts()) {
            System.out.println(product.getRowId() + ") " + product.getName() + " $" + product.getPrice());
        }
    }

    public static void displayPurchase(){
        System.out.println();
        System.out.println("*********************");
        System.out.println("Purchase");
        System.out.println("*********************");
        System.out.println();
        System.out.println("Current money provided: " + Purchase.getMoneyProvided());
        System.out.println("1) Feed Money");
        System.out.println("2) Select Product");
        System.out.println("3) Finish Transaction");
    }
}