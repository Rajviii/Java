package com.company;
import java.util.Scanner;
public class marks_to_percentage_cbse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        System.out.print("Sub1 : ");
        float sub1 = sc.nextFloat();
        System.out.print("Sub2 : ");
        float sub2 = sc.nextFloat();
        System.out.print("Sub3 : ");
        float sub3 = sc.nextFloat();
        System.out.print("Sub4 : ");
        float sub4 = sc.nextFloat();
        System.out.print("Sub5 : ");
        float sub5 = sc.nextFloat();

        float total = (sub1 + sub2 + sub3 + sub4 + sub5);
        System.out.print("Result : ");
        float Result = (total/5);
        System.out.println(Result);
    }
}
