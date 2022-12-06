package com.self.files.git;

import java.util.Random;
import java.util.Scanner;



public class RockPaperScissorGame {
	static void game(int in,int comp) {
		 
		if (in==comp) {
			System.out.println("Match is draw comp has the same entry!!");
			
		} 
		else if ((in==0&&comp==1)||(in==1&&comp==2)||(in==2&&comp==0)){
			System.out.println("Computer is winner");
			
		}
		
		else if ((in==0&&comp==2)||(in==1&&comp==0)||(in==2&&comp==1)){
			System.out.println("You won!!");
			
		}
		else {
			System.out.println("Inavalid input");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 0 for rock 1 for paper and 2 for scissors");
				int player = sc.nextInt();
				Random r1 = new Random();
				int computer = r1.nextInt(3);
				System.out.println("Computer entry: "+computer);
				RockPaperScissorGame game1 = new RockPaperScissorGame();
				game1.game(player, computer);
				
	}

}
