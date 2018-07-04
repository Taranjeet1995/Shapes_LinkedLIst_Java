package com.TaranjeetSingh;

/**
 * * Rectangle class
 */
public class Rectangle implements Shape {

    int l=1,w=3;
    @Override
    public double getPerimeter() {
        return 2*(l+w);
    }

    @Override
    public String toString() {
        return "\n" +
                "Class Name:- Rectangle and Perimeter of Rectangle with length , width "+l+" "+w+" is "+this.getPerimeter();
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
