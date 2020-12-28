package com.company;
import java.util.Scanner;
public class count_cgpa {

    public static void main(String[] args) {
	// write your code here
       Scanner sc = new Scanner(System.in);
       System.out.print("Sub1 : ");
       float sub1 = sc.nextFloat();
       System.out.print("Sub2 : ");
       float sub2 = sc.nextFloat();
       System.out.print("Sub3 : ");
       float sub3 = sc.nextFloat();
       System.out.print("Your Cgpa : ");
       float Cgpa = (sub1 + sub2 + sub3)/30;
       System.out.println(Cgpa);
    }
}
