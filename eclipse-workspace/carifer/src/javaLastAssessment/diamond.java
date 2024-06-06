package javaLastAssessment;

import java.util.Scanner;

public class diamond {
	
	  public static void main(String[] args) {

		  int n;
		  System.out.println("Enter the number");
		  Scanner sc = new Scanner(System.in);
		  n = sc.nextInt();
		
   	        for(int i = 0; i<n; i++) {
   	        	for(int j = 0; j<n-i-1; j++) {
   	        		System.out.print(" ");
   	        	}
   	        	for(int k = 0; k<=i; k++) {
   	        		System.out.print("* ");
   	        	}
   	        	System.out.println();
   	        }
   	        for (int i = 0; i<n-1; i++) {
   	        	for(int j =0; j<=i; j++) {
   	        		System.out.print(" ");
   	        	}
   	        	for(int k = 0; k < n-i-1; k++) {
   	        		System.out.print("* ");
   	        	}
   	        	System.out.println();
   	        }
	    }
	}

