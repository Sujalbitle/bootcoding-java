package com.bootcoding.java;

import java.util.Scanner;

public class BooleanValue1 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
       boolean res = isEven(num);

        System.out.println(res);

    }
    public static boolean isEven(int number){
        if(number%2==0){
         return true;
        }
        else{
            return false;
        }
    }
}
// wam to get boolean value on whether input number is even or not:
//ex :  boolean isEven(int number){...}