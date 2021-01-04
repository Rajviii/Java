package com.company;
import java.util.Scanner;
public class kgs_to_pounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in Kgs: ");
        float Kgs = sc.nextFloat();
        System.out.print("Your weight in Pounds : ");
        float Pounds = 2.204f*Kgs;
        System.out.println(Pounds);
    }
}

