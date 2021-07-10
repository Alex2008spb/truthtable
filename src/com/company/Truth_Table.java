package com.company;

import java.util.Scanner;

public class Truth_Table {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner("&" +
                "|" +
                "^");

        System.out.println("Я могу составить таблицу истиности");
        System.out.println("X 1 действие Y 2 действие Z");
        System.out.println(" Ведите цифру стоящею рядом с нужным действием");
        System.out.println("вводите сначало 1 действие затем 2");
        System.out.println("1 &");
        System.out.println("2 |");
        System.out.println("3 ^");


        Scanner save = new Scanner(System.in);
        String line = "0";
        int scan = save.nextInt();
        String xore = "134";

        if (scan == 1) {
            xore = "&";
        } else {
            if (scan == 2) {
                xore = "|";
            } else {
                if (scan == 3) {
                    xore = "^";


                }
                System.out.println("X "+xore+"Y 2 действие Z");

                int scan = save.nextInt();
                String xore1 = "134";

                if (scan == 1) {
                    xore1 = "&";
                } else {
                    if (scan == 2) {
                        xore1 = "|";
                    } else {
                        if (scan == 3) {
                            xore1 = "^";
            }
        }
    }
}