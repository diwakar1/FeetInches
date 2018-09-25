package com.company;

public class FeetInches
{
private int feet;
private int inches;

    public FeetInches()
    {
        feet=0;
        inches=0;
    }

    FeetInches(int f, int i)
    {
        feet=f;
        inches= i;
        simplify();
    }

    private  void simplify()
    {
        if (inches >11)
        {
            feet = feet+inches/12;
            inches=inches%12;
        }
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
        simplify();
    }

    @Override
    public String toString() {
        String str=
                  feet + " feet "
                 + inches+ " inch ";
        return str;

    }
    public FeetInches add(FeetInches object2)
    {
        int totalFeet;
        int totalInches;
        totalFeet=feet+object2.getFeet();
        totalInches=inches+object2.getInches();
        return new FeetInches(totalFeet,totalInches);
    }
    public boolean equals(FeetInches object2)
    {
        boolean status;
        if(feet== object2.getFeet()&&
        inches== object2.getInches())
        status=true;
        else
            status=false;
        return status;
    }
}
