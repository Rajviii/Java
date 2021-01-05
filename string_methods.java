package com.company;

public class string_methods {

    public static void main(String[] args) {
	// write your code here
        String name = "Ariana";

        int value = name.length();
        System.out.println(value);

        String l_string = name.toLowerCase(); //convert the whole string into the lower case
        System.out.println(l_string);
        String u_string = name.toUpperCase(); //convert the whole string into upper case
        System.out.println(u_string);

        //notTrimmedString will print the blank spaces
        String notTrimmedString = "       Ariana       ";
        System.out.println(notTrimmedString);
        //using .trim() it'll not consider the blank spaces
        String TrimmedString = notTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println(name.substring(1)); //it'll print the string from 1 index - "riana"
        System.out.println(name.substring(5)); //it'll print the string from 5 index - "a"

        System.out.println(name.substring(1,4)); //it includes the index 1's letter but exclude the index 4's letter - "ria"
        System.out.println(name.substring(0,6)); //our string is up to 5 index but if we want to print a whole string then write a extra index('coz it doesn't include last index) - "Ariana"

        //replace single char
        System.out.println(name.replace('n', 'h'));
        //replace string also
        System.out.println(name.replace("ana" , "es"));

        //startsWith and endsWith
        //it it is starting with which string we put then it'll return true otherwise 0
        System.out.println(name.startsWith("Ar")); //true
        System.out.println(name.startsWith("an")); //false
        System.out.println(name.endsWith("ri")); //false
        System.out.println(name.endsWith("ana")); //true

        System.out.println(name.charAt(1)); //prints the char at the given index

        //indexOf()
        System.out.println(name.indexOf("Ari")); //which string is there it will consider 1st char's index and print that index as a given string's index
        System.out.println(name.indexOf("ari")); //otherwise -1 (ari is not there Ari is there)

        //indexOf & lastIndexOf
        String modifiedName = "Arianaana";
        //from which index we have given here it will start finding our given string and print the starting index of the particular string
        System.out.println(modifiedName.indexOf("ana",2));
        //it'll print the a's index where the a stands for last time
        System.out.println(modifiedName.lastIndexOf("a"));
        System.out.println(modifiedName.lastIndexOf("r"));
        System.out.println(modifiedName.lastIndexOf("ana"));
        //it'll consider 1st 5 index and find the last occurred a
        System.out.println(modifiedName.lastIndexOf("a" , 5));
        System.out.println(modifiedName.lastIndexOf("na" , 8));

        //it'll return true if the linked name is correct otherwise false
        //case sensitive
        System.out.println(name.equals("Ariana"));
        System.out.println(modifiedName.equals("Arianana"));
        //for ignoring Case sensitivity
        System.out.println(name.equalsIgnoreCase("aRiAna"));

        //Escape sequence characters
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \' single quote");
        System.out.println("I am escape sequence \\ backslash");
        System.out.println("I am escape sequence  \n new line");
    }
}
