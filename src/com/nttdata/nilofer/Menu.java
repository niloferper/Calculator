package com.nttdata.nilofer;

import java.util.Scanner;

public class Menu {

		public void printMenu() {

			float num1 = 0f;
			float num2 = 0f;
			boolean exitflag = false;
			do {
				
			float result;
			
			System.out.println("------------------------");
			System.out.println("* 1. A + B             *");
			System.out.println("* 2. A - B             *");
			System.out.println("* 3. A * B             *");
			System.out.println("* 4. A / B             *");
			System.out.println("-----------------------*");
			System.out.println("Please enter a choice :");

			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			if (choice != 0)
			{
			System.out.println("First number is : " );
			 num1 = input.nextFloat();
			System.out.println("Second number is : ");
			 num2 =input.nextFloat();
			}
			Calculator myCalcObj = new Calculator();
			switch (choice) {
			case 1: {
				
				 result = myCalcObj.sum(num1,num2);
				 System.out.println("Result : " + result);
				break;
			}

			case 2: {
				// Substract numbers
				 result = myCalcObj.diff(num1, num2);
				 System.out.println("Result : " + result);
				break;
			}
			case 3: {
				// Multiply numbers
				 result = myCalcObj.multiply(num1, num2);
				 System.out.println("Result : " + result);
				break;
			}
			case 4: {

				// Divide numbers
				 result = myCalcObj.divide(num1, num2);
				 System.out.println("Result : " + result);
				break;
			}	
			default:{
				
				System.out.println("exit");
				exitflag = true;
				break;}
			}
	}while(exitflag==false);
		}
	}

