package com.bootcoding.java;

import java.util.Scanner;

public class MethodExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enrte a number ");
        int num=sc.nextInt();
        int sum=sc.nextInt();
        calculateArmstrong(num);
        calculateArmstrong(sum);
    }
    public static void calculateArmstrong(int n){

        int temp=n;
        int sum=0;
        int rem=0;
        while (temp != 0) {
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if (n == sum) {

            System.out.println(n+" Is a armstrong number ");
        }else {
            System.out.println(n+ " is not  a armstrong number ");
        }

    }

}
