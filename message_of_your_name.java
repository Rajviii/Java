package com.company;
import java.util.Scanner;
public class message_of_your_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello Gorgeous " + name + " Have a nice day :)");
    }
}
