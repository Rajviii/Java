package com.company;
import java.util.Scanner;
public class kms_to_miles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kms : ");
        float Kms = sc.nextFloat();
        System.out.print("Your Conversion : ");
        float Miles = 0.621f*Kms;
        System.out.println(Miles);
    }
}
