package com.hackerrank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Opertors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        double tip,tax,totalcost;
        tip=(meal_cost*tip_percent)/100;
        tax=(meal_cost*tax_percent)/100;
        totalcost=meal_cost+tip+tax;
        int totalcostrounded = (int) Math.round(totalcost);
        System.out.print("The total meal cost is "+totalcost +" dollars.");
        in.close();
        
        
    }
}
