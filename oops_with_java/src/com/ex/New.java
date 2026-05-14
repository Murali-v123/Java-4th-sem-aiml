package com.ex;

import java.util.Random;
import java.util.Scanner;

public class New {
//Improved ASCII Art Display Method
	public static void showChoice(int choice) {
		switch (choice) {

		case 1: // ROCK
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║              ROCK 🪨                ║");
			System.out.println("╚════════════════════════════════════╝");
			System.out.println("            _______                 ");
			System.out.println("        ---'   ____)                ");
			System.out.println("              (_____)               ");
			System.out.println("              (_____)               ");
			System.out.println("              (____)                ");
			System.out.println("        ---.__(___)                 ");
			System.out.println("                                    ");
			System.out.println("        🪨 ROCK CRUSHES SCISSORS!    ");
			break;

		case 2: // PAPER
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║              PAPER 🪨               ║");
			System.out.println("╚════════════════════════════════════╝");
			System.out.println("             _______                ");
			System.out.println("         ---'   ____)____           ");
			System.out.println("                   ______)          ");
			System.out.println("                  _______)          ");
			System.out.println("                 _______)           ");
			System.out.println("         ---.__________)            ");
			System.out.println("                                    ");
			System.out.println("        📄 PAPER COVERS ROCK!       ");
			break;

		case 3: // SCISSORS
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║              SCISSOR 🪨             ║");
			System.out.println("╚════════════════════════════════════╝");
			System.out.println("             _______                ");
			System.out.println("         ---'   ____)___            ");
			System.out.println("                   _____)_          ");
			System.out.println("                __________)         ");
			System.out.println("               (____)               ");
			System.out.println("         ---.__(___)                ");
			System.out.println("                                    ");
			System.out.println("       ✂️ SCISSORS CUT PAPER!       ");
			break;
		}

		System.out.println("\n══════════════════════════════════════\n");
	}

	public static String getChoice(int choice) {
		switch (choice) {
		case 1 -> {
			return "Rock";
		}
		case 2 -> {
			return "paper";
		}
		case 3 -> {
			return "scissor";
		}
		default -> {
			return "invalid";
		}

		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("===========");
		System.out.println("Rock Paper Scissor");
		System.out.println("user vs me");
		System.out.println("============");
		
		boolean play=true;
		
		while(play) {
			System.out.println("choose your option:");
			System.out.println("1.rock");
			System.out.println("2.paper");
			System.out.println("3.scissor");
			int userin=s.nextInt();
			
			if(userin<1 || userin>3) {
				System.out.println("Invalid choice select 1,2,3:");
				continue;
			}
			int cmpchce=rand.nextInt(3)+1;
			System.out.println("User choice: "+userin);
			showChoice(userin);
			
			System.out.println("Compute Choice: "+cmpchce);
			showChoice(cmpchce);
			
			if(userin==cmpchce) {
				System.out.println("It's a draw");
			}
			else if((userin==1 && cmpchce==3) ||(userin==2 && cmpchce==2)||(userin==3 && cmpchce==1)) {
				System.out.println("You win!");
			}
			else {
				System.out.println("Computer wins!");
			}
			System.out.println("Do u want to play again(y/n):)");
			char ans=s.next().charAt(0);
			if(ans=='n' || ans=='N') {
				play=false;
			}
		}
		System.out.println("!Yo bro see you again🤞");
		s.close();
	}
}
