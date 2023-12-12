package org.ramcharan.equalsandhashcode;

public class Fruit {
    String name;
    String color;
    int internalHashCode;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
        this.internalHashCode = 1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        if (!name.equals(fruit.name)) return false;
        return color.equals(fruit.color);
    }

    // If u return 1 in hashcode,
    // then all the objects will get hashcode as 1,
    // which equals all the objects hashcode and only one object is added in Set<Fruit>.
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + " colour is " + color;
    }
}
