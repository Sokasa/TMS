package strategy.model;

import strategy.SortCompareTor;

public class Cat4 {

    private int high;
    private int weight;

    public Cat4(int high, int weight) {
        this.high = high;
        this.weight = weight;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat4{" +
                "high=" + high +
                ", weight=" + weight +
                '}';
    }
}
