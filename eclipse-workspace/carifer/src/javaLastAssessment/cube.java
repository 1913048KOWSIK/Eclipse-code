package javaLastAssessment;

import java.util.Scanner;

public class cube {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = scanner.nextInt();

	        System.out.println("Cube of numbers from 1 to " + n + ":");

	        for (int i = 1; i <= n; i++) {
	            int cube = i * i * i;
	            System.out.println(i + " * " + i + " * " + i + " = " + cube);
	        }
	    }
	}

