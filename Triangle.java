package com.TaranjeetSingh;

public class Triangle implements Shape {

 /**
 * Triangle class
 */


    int a=2,b=4,c=3;
    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "\n" +
                "Class Name:- Triangle and Perimeter of Triangle with a,b,c "+a+" "+b+" "+c+" is "+this.getPerimeter();
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
