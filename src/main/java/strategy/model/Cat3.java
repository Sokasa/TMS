package strategy.model;

import strategy.SortComparable;

public class Cat3 implements SortComparable<Cat3> {

    private int age;

    public Cat3(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat3{" +
                "age=" + age +
                '}';
    }


    @Override
    public int compareTo(Cat3 o) {
        if (o.age > this.age) {
            return -1;
        } else if (o.age == this.age) {
            return 0;
        }
        return 1;
    }
}
