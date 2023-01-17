package com.bootcoding.java;
import java.util.Scanner;
public class ArmstromngNumber {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
       int digit ;
        int cube=0;

       int temp=n;

        while (n != 0) {
          digit=n%10;

            cube= (int) (cube+Math.pow(digit,3));
            n=n/10;


        }
        if(cube == temp){
            System.out.println("given number is armstrong number ");
        }
        else {
            System.out.println("not a armstrong number ");
        }
    }

}
