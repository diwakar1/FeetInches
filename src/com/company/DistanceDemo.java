package com.company;

import java.util.Scanner;

/**
 * Created by diwakarsharma on 9/24/18.
 */
public class DistanceDemo
{
    public static void main(String[] args)
    {


        int feet, inches;
        FeetInches feetInches;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a distance in feet " + "add inches");

        System.out.println("first enter the feet: ");
        feet= input.nextInt();

        System.out.println("second enter the inches: ");
        inches= input.nextInt();

        feetInches = new FeetInches( feet,inches);

        System.out.println("the distance you entered is:"
                           + feetInches.toString());

        FeetInches distance1 = new FeetInches(5,9);

        FeetInches distance2 = new FeetInches(5,9);
        FeetInches distance3;

        distance3= distance1.add(distance2);

        System.out.println("The first distance is "+ distance1);
        System.out.println("The second distance is "+ distance2);
        System.out.println("The sum of these distances is  "+ distance3);

        FeetInches f = new FeetInches();

        f.setFeet(12);
        f.setInches(23);

        System.out.println( "You entered now :"+ f.getFeet()+" feet " + +f.getInches()+ " inches");

        if (distance1.equals(distance2))
            System.out.println("distances 1 and 2 are the same");
        else System.out.println("They are not the same.");

        if(distance1.equals(distance3))
            System.out.println("distances 1 and 3 are the same");
        else
            System.out.println("distance1 and distance3 are not the same");

    }

}
