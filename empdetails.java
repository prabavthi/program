package myfiles.index;

import java.util.Scanner;

public class empdetails {
	    public static void main(String[] args) {
	        // Create a scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Taking employee details input from the user
	        System.out.println("Enter Employee Name: ");
	        String empName = scanner.nextLine();

	        System.out.println("Enter Employee ID: ");
	        int empId = scanner.nextInt();

	        System.out.println("Enter Employee Salary: ");
	        double empSalary = scanner.nextDouble();
	        scanner.nextLine(); // Consume the newline character left by nextDouble()

	        System.out.println("Enter Employee Address: ");
	        String empAddress = scanner.nextLine();

	        System.out.println("Enter Pincode: ");
	        String pincode = scanner.nextLine();

	        // Printing employee details
	        System.out.println("\nEmployee Details:");
	        System.out.println("Name: " + empName);
	        System.out.println("ID: " + empId);
	        System.out.println("Salary: " + empSalary);
	        System.out.println("Address: " + empAddress);
	        System.out.println("Pincode: " + pincode);

	        // Close the scanner
	        scanner.close();
	    }
	}
