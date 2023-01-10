package com.bootcoding.java;

import java.util.Scanner;

public class MaxThreeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");

        int b=sc.nextInt();
        System.out.println("Enter third number ");
        int c=sc.nextInt();

        //logic to find max of three number
        if(a>=b && a>=c){
            System.out.println(a+" is greater ");
        } else if (b>=a && b>=c) {
            System.out.println("B is greater ");

        }
        else{
            System.out.println("C is greater ");
        }


    }

}
