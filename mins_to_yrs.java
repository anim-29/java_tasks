package com.anim.java;
import java.util.Scanner;
public class mins_to_yrs {
	public static void main(String[] Strings) {


        double minutesInYear = 60 * 24 * 365;

        Scanner i = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = i.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }

}
