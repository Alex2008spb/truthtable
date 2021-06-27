package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println ("not   x     !x");
        System.out.println (" 1   " + false + "  " + (!false));
        System.out.println (" 2   " + true + "   " + (!true));
        System.out.println ();
        System.out.println ("And  x1   x2     x1 & x2");
        System.out.println (" 1  " + false + " " + false + "  " + (false & false));
        System.out.println (" 2  " + false+" "+true + "   " + (false & true));
        System.out.println (" 3  " + true + "  " + false + "  "+ (true & false));
        System.out.println (" 4  " + true + "  " + true + "   " +(true & false));
        System.out.println ();
        System.out.println ("Or   x1   x2      x1 | x2 ");
        System.out.println (" 1  " + false + " " + false + "   " + (false | false));
        System.out.println (" 2  " + true + "  " + false + "   " + (true | false));
        System.out.println (" 3  " + false + " " + true + "    " + (false | true));
        System.out.println (" 4  " + true + "  " + true + "    " + (true | true));
        System.out.println ();
        System.out.println ("XOR  x1    x2      x1 ^ x2");
        System.out.println (" 1  " + false + " "+false+"    " + (false ^ false));
        System.out.println (" 2  " + true + "  "+false+"    " + (true ^ false));
        System.out.println (" 3  " + false + " " + true + "     " + (false ^ true));
        System.out.println (" 4  " + true + "  " + true + "     " + (true ^ true));
    }
}
