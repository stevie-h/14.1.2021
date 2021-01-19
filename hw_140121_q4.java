// https://github.com/qa191120/14.01.2021/blob/main/hw.txt

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner prn = new Scanner(System.in);

//ex4
        System.out.println("Please enter an integer: ");
        int num4dig = prn.nextInt();
        System.out.println("The number of digits is: " + howManyDigits(num4dig));
        System.out.println("Please enter a double: ");
        double num4digf = prn.nextDouble();
        System.out.println("Print with stars: " + howManyDigits(num4digf));

    
    private static String howManyDigits(double num4)
    {     // this doesn't work with float because it's not precisely defined in java
        String star4 = "";
        int count_ldecimal = 0;
        int count_rdecimal = 0;
        int num4_ld = (int)num4;
        double num4_rd = num4;
        do
        {
            num4_ld /= 10;
            count_ldecimal++;
        }
        while (num4_ld != 0);
        do
        {
            num4_rd *= 10;
            count_rdecimal++;
        }
        while (num4_rd - (int)num4_rd != 0);
        for (int i = 0 ; i < count_ldecimal ; i++)
        {
            star4 = star4 + "*";
        }
        star4 = star4 + ".";
        for (int i = 0 ; i < count_rdecimal ; i++)
        {
            star4 = star4 + "*";
        }
        return star4;
    }
}


