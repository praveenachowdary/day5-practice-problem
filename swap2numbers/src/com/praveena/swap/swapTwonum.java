package com.praveena.swap;
import java.util.Scanner;

public class swapTwonum {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the two numbers that should be swapped");
            int number1=sc.nextInt();
            int number2=sc.nextInt();
            utility u1= new utility();
            u1.swap(number1,number2);
        }
    }

