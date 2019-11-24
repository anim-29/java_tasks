package com.anim.java;


import java.util.Scanner;
		
public class Circle 
{
	public static void main(String[] args)
	{
	    int r;
	    double pi = 3.14,perimeter,area;
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("Enter radius of Circle:");
	    r = s.nextInt();
	    perimeter =2*pi*r;
	    area=pi*r*r;
	    System.out.println("Perimeter of Circle:"+perimeter);
		System.out.println("Area of Circle:"+area);
	}
}