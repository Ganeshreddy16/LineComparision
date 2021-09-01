package org.blz.assignmnt;
import java.util.Scanner;

public class LineComparision
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int x1, x2, y1, y2;
        String Length1,Length2;
        System.out.println("Enter Coordinates of 1st line x1,y1,x2,y2");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        Length1 =String.valueOf(Math.sqrt(Math.pow( (x2-x1) ,2 ) + Math.pow( (y2-y1) , 2) ));
        System.out.println("Your length is " + Length1);

        System.out.println("Enter Coordinates of 2nd line x1,y1,x2,y2");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        Length2 =String.valueOf(Math.sqrt(Math.pow( (x2-x1) ,2 ) + Math.pow( (y2-y1) , 2) ));
        System.out.println(Length2);
        System.out.println("Your length is " + Length2);

        System.out.println("The result of equality of two lines is " + Length1.equals(Length2));
    }

}