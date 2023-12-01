package com.cloudydaiyz.learningcenter.ansys;

// This is just a test Main class

import java.util.ArrayList;
public class Main {

    public static void displayMenu(ArrayList<MenuItem> menu) {
        for(MenuItem item : menu) {
            System.out.println(item);
        }
    }

    public static void sellMenuItem() {

    }
    public static void main(String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new IceCream("Vanilla", 2.95));
        menu.add(new IceCream("Chocolate", 3.25));
        menu.add(new Soda("Pineapple", 4.50));
        menu.add(new Soda("Strawberry", 4.00));

        Soda pineapple = (Soda) menu.get(2);
        Soda strawberry = (Soda) menu.get(3);

        pineapple.sell();
        strawberry.sell();

        System.out.println(Soda.getTotalSales());

        /*
                  @@@@@@@     MENU     @@@@@@@
            Ice Cream % Vanilla      ------     $2.95
            Ice Cream % Chocolate    ------     $3.25
            Soda      % Pineapple    ------     $4.50
            Soda      % Strawberry   ------     $4.00
        */
        displayMenu(menu);
    }
}