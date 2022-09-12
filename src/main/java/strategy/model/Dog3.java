package strategy.model;

import strategy.SortComparable;

public class Dog3 implements SortComparable<Dog3> {

    private int age;

    public Dog3(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog3{" +
                "age=" + age +
                '}';
    }


    @Override
    public int compareTo(Dog3 o) {
        if (o.age > this.age) {
            return -1;
        } else if (o.age == this.age) {
            return 0;
        }
        return 1;
    }
}
