package com.TaranjeetSingh;

/**
 * Square class
 */

public class Square implements Shape {

    int a=4;
    @Override
    public double getPerimeter() {
        return 4*a;
    }

    @Override
    public String toString() {
        return "\n" +
                "Class Name:- Square and Perimeter of Square with side "+a+" is "+this.getPerimeter();
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
