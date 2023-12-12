package org.ramcharan.equalsandhashcode;

public class MyObject {
    private double obj1;
    private double obj2;

    public MyObject(double obj1, double obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
/*
    @Override
    public boolean equals(Object obj) {
        //compare the input to itself.
        //'==' symbol returns true if both references pointing to same object.
        if (obj == this){
            return true;
        }
        //checking whether the input is an instance of MyObject class.
        if (!(obj instanceof MyObject)){
            return false;
        }
        //cast the input with the MyObject class.
        //so that we can access the fields in MyObject through the input.
        MyObject o = (MyObject) obj;


        return Double.compare(obj1,o.obj1) == 0
                && Double.compare(obj2,o.obj2) == 0;
    }
 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        MyObject myObject = (MyObject) o;

        if (Double.compare(obj1, myObject.obj1) != 0) return false;
        return Double.compare(obj2, myObject.obj2) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(obj1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(obj2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }
}
