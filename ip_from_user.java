package com.company;
import java.util.Scanner;
public class ip_from_user {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number2 : ");
        int b = sc.nextInt();
        System.out.print("The sum is : ");
        int sum = a + b;
        System.out.println(sum);

    }
}
