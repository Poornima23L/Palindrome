package com.tgt.ignite.plus;

import java.util.Scanner;

public class palin {
    public static void main(String[] args){
        String str,rev="";
        Scanner read = new Scanner(System.in);
        System.out.println("enter string");
        str = read.nextLine();
        int len= str.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }

    }
}
