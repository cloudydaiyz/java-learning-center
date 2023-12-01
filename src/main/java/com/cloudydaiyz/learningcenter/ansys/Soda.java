package com.cloudydaiyz.learningcenter.ansys;

import com.cloudydaiyz.learningcenter.ansys.MenuItem;

public class Soda implements MenuItem {

    private String name;
    private double cost;
    private int numSold;
    private static int totalNumSold;

    public Soda(String _name, double _cost) {
        name = _name;
        cost = _cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double _cost) {
        cost = _cost;
    }

    public int getSales() {
        return numSold;
    }

    public static int getTotalSales() {
        return totalNumSold;
    }

    public void sell() {
        numSold++;
        totalNumSold++;
    }

    public String toString() {
        return "Soda % " + name + " ------ $" + String.format("%.2f", cost);
    }
}

