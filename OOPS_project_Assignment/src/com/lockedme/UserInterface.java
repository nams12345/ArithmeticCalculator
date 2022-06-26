package com.lockedme;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface extends File_Functions{
	static Scanner sc=new Scanner(System.in);
	private static void userDetails() {
		System.out.println("\n********* Welcome to LockedMe.com **********\n\n");
		System.out.println("Developer Details\n==================");
		System.out.println("Name:\tNamrata Anatrao Gadkar");
		System.out.println("Project name: LockedMe.com");
		System.out.println("Email id: namaratagadkar5@gmail.com\n...................................\n");
		
	}
	 static void option2() {
		 int ch=0;
		
	 breakMe: while(true) {
		System.out.println("\n*****************\n1. Add a new file\n"
				+ "\n2. Delete a file\n\n3. Search a file\n\n4. Go back to main menu");
		 boolean flag=true;
			while(flag) try {
					ch=sc.nextInt();
					flag=false;
			}
			catch(InputMismatchException e){
				System.out.println("++++Enter the correct input.Try again++++");
				
				sc.nextLine();
			}
			switch(ch) {
				case 1: 
						addNewFile();
					break;
				case 2: 
						try{deleteFile();}
						catch(FileNotFoundException e) {
							System.out.println("File Not Found with this name");
						}
						catch(IOException e) {
							e.printStackTrace();
						}
					break;
				case 3: 
					searchFileName();
					break;
				case 4: 
					System.out.println("****************************************");
					break breakMe;
				default: 
					System.out.println("Wrong input , given try again !!!");
			}//try
		}// while close
	}
	public static void main(String[] args) {
			int ch=0;
			
			UserInterface.userDetails();
			while(true) {
			System.out.println("\nMain Menu \n---------\n1. Display file names in ascending order from root directory\n\n"
					+ "2. Perform Some Operations(Add or Delete or Search)\n\n3. Close Application");
			boolean flag=true;
	
		
			while(flag) try {
				ch=sc.nextInt();
				flag=false;
		}
		catch(InputMismatchException e){
			System.out.println("++++Enter the correct input.Try again++++");
			
			sc.nextLine();
		}
	
			switch(ch) {
				case 1: 
					returnCurrentFilesInAscendingOrder();
					break;
				case 2: 
					UserInterface.option2();
					break;
				case 3: 
					System.out.println("**********Thank you for using LockedMe.com************\n\t\tExit Success !!!");
					System.exit(0);
					break;
				default: 
					System.out.println("Wrong input , given try again !!!");
			}
	
		}//while close
	}

}
