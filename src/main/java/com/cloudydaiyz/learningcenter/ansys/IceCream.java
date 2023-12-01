package com.cloudydaiyz.learningcenter.ansys;

public class IceCream implements MenuItem{

    private String name;
    private double cost;

    public IceCream(String _name, double _cost) {
        name = _name;
        cost = _cost;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public void setCost(double _cost) {
        cost = _cost;
    }

    public String toString() {
        return "Ice Cream % " + name + " ------ $" + String.format("%.2f", cost);
    }
}
