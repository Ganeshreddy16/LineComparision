package org.blz.assignmnt;
import java.util.Scanner;

public class LineComparision
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.println("Enter Coordinates x1,y1,x2,y2");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        double Length =Math.sqrt(Math.pow( (x2-x1) ,2 ) + Math.pow( (y2-y1) , 2) );
        System.out.println(Length);
        System.out.println("Your length is " + Length);
    }

}