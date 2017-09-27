package com.example.java;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution toward CCI book problem of checking for unique strings. Use a boolean array
            of size 128 to represent 128 unique ASCII characters. Turn each element in the array to True if a unique
            character is found. If another character is encountered that already the flag was True for that particular
            unique character then the result should return False to indicate that the string input did not contain
            all unique characters.
         */

        //Decalaring and defining a String object.
        String str = "Hello world!";
        boolean test = isUniqueChars(str);
        System.out.println(test);

        //Re-defining the previous declared/defined String object.
        str = "abcdefg";
        test = isUniqueChars(str);
        System.out.println(test);

        str = "CHRistopher";
        test = isUniqueChars(str);
        System.out.println(test);



    }


    //Method for checking for unique characters
    static boolean isUniqueChars(String str){

        //Check for valid string length of uniqueness via 128 maximum characters of ASCII.
        if (str.length() > 128){
            System.out.println("String is beyond 128 unique character length.");
            return false;
        }

        boolean [] char_Set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i);

            if (char_Set[val]){
                System.out.println("At string index: " + i + " Duplicate character was found! ");
                return false;
            }
            char_Set[val] = true;   //Character is unique therefore assign True to the element in the array

        }

        System.out.println("All characters in String were unique! ");
        return true;

    }


}
