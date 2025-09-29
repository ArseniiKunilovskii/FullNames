package com.pluralsight;

import java.util.Scanner;

public class FullNamesApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first="";
        String last="";
        String middle="";
        String suffix="";
        String output ="";

        System.out.println("Please input your FIRST name:");
        first = in.nextLine().trim();
        System.out.println("Please input your LAST name:");
        last = in.nextLine().trim();
        System.out.println("Do you have MIDDLE name?(yes/no)");
        if (in.nextLine().equalsIgnoreCase("yes")){
            System.out.println("Please enter your MIDDLE name:");
            middle = in.nextLine().trim();
        }
        System.out.println("Do you have suffix?(yes/no)");
        if (in.nextLine().equalsIgnoreCase("yes")){
            System.out.println("Please enter your suffix:");
            suffix = in.nextLine().trim();
        }

        output += first.substring(0,1).toUpperCase()+first.substring(1);
        if (!middle.equals("")){
            output += " " + middle.substring(0,1).toUpperCase()+".";
        }
        output += " " + last.substring(0,1).toUpperCase()+last.substring(1);
        if (!suffix.equals("")){
            output += ", " + suffix;
        }
        System.out.println("Full name: " + output);
    }
}
