package Exercise1;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Bernard Fonrose
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.print("What is your Name? ");

        String Name = name.nextLine();

        System.out.printf("\nHello, %s, nice to meet you!", Name);
    }
}
