package com.TaranjeetSingh;

/**
*Circle class implementing interface named shape
 */

public class Circle implements Shape {

    int r=2;

    @Override
    public double getPerimeter() {
        return 2*3.14*r;
    }

    @Override
    public String toString() {
        return "\n" +
                "Class Name:- Circle and Perimeter of Circle with radius "+r+" is "+this.getPerimeter();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = (int) (31 * result + getPerimeter());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        return false;
    }
}
