/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */

package org.example;
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        Scanner getNoun = new Scanner(System.in);
        Scanner getVerb = new Scanner(System.in);
        Scanner getAdj = new Scanner(System.in);
        Scanner getAdv = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = getNoun.nextLine();
        System.out.print("Enter a verb: ");
        String verb = getVerb.nextLine();
        System.out.print("Enter a adjective: ");
        String adj = getAdj.nextLine();
        System.out.print("Enter a adverb: ");
        String adv = getAdv.nextLine();

        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!",verb,  adj,  noun,  adv));
    }
}
