package com.self.files.git;
import java.util.Random;
import java.util.Scanner;

public class game1 {

	public static void main(String[] args) {
		//Random rand1 = new Random(100);
				int num2 = (int)(Math.random()*(100-0+1)+0);
				//System.out.println(num2);
				//int count = 0;
				int i=0;
				for(; i<100;i++) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter a number: ");
					int num1 = sc.nextInt();
				if (num1>num2) {
		System.out.println("You entered a larger number,enter a number less than this");


				} 
				else if (num1<num2) {
		System.out.println("You entered a smaller number,enter a number greater than this");


				} 
				else if (num1==num2) {
		System.out.println("Your guess is correct, you won");
		System.out.println("Your score is: "+(100-i));
		break;
				} 
				else {
					System.out.println("Invalid input");
					
					
					}
				} 

	}

}
