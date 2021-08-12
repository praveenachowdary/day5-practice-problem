package com.praveena.factor;
import java.util.Scanner;

public class Factor {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number to get its factors");
            int number=sc.nextInt();
            utility u1=new utility();
            u1.primefactor(number);

        }
    }

