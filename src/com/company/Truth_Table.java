package com.company;

import java.util.Scanner;

public class Truth_Table {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner("&" +
                "|" +
                "^");

        System.out.println ("Я могу составить таблицу истиности");
        System.out.println ("X 1 действие Y 2 действие Z");
        System.out.println (" Ведите цифру стоящею рядом с нужным действием");
        System.out.println ("вводите сначало 1 действие затем 2");
        System.out.println ("&");
        System.out.println ("|");
        System.out.println ("^");

        String save = "";
        save = scanner.nextLine ();
        for ( String line2 = "0"; ;  )
        { line2 = scanner.nextLine();

        }

            }
}
