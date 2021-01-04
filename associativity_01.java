package com.company;

public class associativity_01 {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Wrong answer because of datatype declaration : ");
        float a = 7/4 * 9/2;
        System.out.println(a);
        System.out.print("Right answer : ");
        float b = 7/4.0f * 9/2.0f;
        System.out.println(b);
    }
}
