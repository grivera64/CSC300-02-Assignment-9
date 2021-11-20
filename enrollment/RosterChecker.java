//package assignment9.enrollment;

/*
 *
 * Name: RosterChecker.java
 * Purpose: Runs a SpringFieldSchool Roster and tests Sets
 * Author: grivera64
 * Date: 11/19/2021
 *
 */

import java.util.Scanner;

public class RosterChecker {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        SpringfieldSchoolRoster<String> roster = new SpringfieldSchoolRoster<>();
        String entry;

        System.out.println("Enter XXX to exit the system");
        System.out.print("Enter Student Name: ");
        entry = keyboard.nextLine();

        while (!entry.equals("XXX")) {

            System.out.printf("%s has %s enrolled\n",
                    entry, roster.addStudent(entry) ? "now been" : "already");

            System.out.println("Enter XXX to exit the system");
            System.out.print("Enter Student Name: ");
            entry = keyboard.nextLine();

        }

    }

}
