package com.bootcoding.java;

import java.util.Scanner;

public class EvenOddProgram {
    public static void main(String args[]){
        //write a program to take 3 integer numbers from user and print maximum number among them
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b)
        {
            System.out.println("A is greater ");
            if(a<b){
                System.out.println("B is greater ");


        }
            else{
                System.out.println("C is greater ");
            }

        }




    }
}
