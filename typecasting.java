package com.company;

public class typecasting {
    public static void main(String[] args) {
        //Fake grade Vs Real grade
        char grade = 'B';
        System.out.print("Fake grade : ");
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting grade
        System.out.print("Original grade : ");
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
