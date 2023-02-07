package BP_J1_P1;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		//System.out.println(secret1 + "\n" + secret2 + "\n" + secret3 + "\n" + secret4);
		
		System.out.println("\nPut in the color to guess.");
		System.out.println("You can choice from:");
		System.out.println(" - Red = 1");
		System.out.println(" - Blue = 2");
		System.out.println(" - Green = 3");
		System.out.println(" - Purple = 4");
		System.out.println(" - Orange = 5");
		System.out.println(" - Yellow = 6");
		
		Scanner sc = new Scanner(System.in);
		
		int guess = 1;
		int checker = 0;
		int finished = 0;
		
		int choiceColor1 = 0;
		int choiceColor2 = 0;
		int choiceColor3 = 0;
		int choiceColor4 = 0;
		
		//int isDeveloper = 0;
		//int skip = 0;
		//int wantToWin = 0;
		int difficulty = 0;
		
		
		System.out.println("\n\nWhat difficulty do you want to play? Normal = 1, Hard = 2 (Hard is not yet fully functional!)");
		difficulty = sc.nextInt();
		if (difficulty == 1) {
			System.out.println("You have choicen the Normal difficulty.");
			System.out.println("On this difficulty, you can only use 1 specific color per guess.");
			System.out.println("Have fun!");
		}
		else if (difficulty == 2) {
			System.out.println("You have choicen the Hard difficulty.");
			System.out.println("On this difficulty, you can use 1 specific color multiple times per guess.");
			System.out.println("Good luck!");
		}
		
		
		
		
		
		
		
		//System.out.println("\n\nAre you a developer? (yes = 1, no = 0)");
		//isDeveloper = sc.nextInt();
		//if (isDeveloper == 1) {
			//System.out.println("Want to skip the game? (yes = 1, no = 0)");
			//skip = sc.nextInt();
			//if (skip == 1) {
				//System.out.println("Do you want to skip and win or lose the game? (win = 1, lose = 0)");
				//wantToWin = sc.nextInt();
				//if (wantToWin == 1) {
					//finished = 1;
				//}
				//else {
					//guess = 11;
				//}
			//}
		//}
		
		
		
		
		
		
		int upperbound = 6;
		
		Random rand1 = new Random();
		int secret1 = rand1.nextInt(upperbound);
		while (secret1 < 1) {
			secret1 = rand1.nextInt(upperbound);
		}
		
		
		
		Random rand2 = new Random();
		int secret2 = rand2.nextInt(upperbound);
		if (difficulty == 1) {
			while (secret2 == secret1 || secret2 < 1) {
				secret2 = rand2.nextInt(upperbound);
			}
		}
		
		
		else if (difficulty == 2) {
			while (secret2 < 1) {
				secret2 = rand2.nextInt(upperbound);
			}
		}
		
		
		Random rand3 = new Random();
		int secret3 = rand3.nextInt(upperbound);
		
		if (difficulty == 1) {
			while (secret3 == secret1 || secret3 == secret2 || secret3 < 1) {
				secret3 = rand3.nextInt(upperbound);
			}
		}
		else if (difficulty == 2) {
			while (secret3 < 1) {
				secret3 = rand3.nextInt(upperbound);
			}
		}
		
		Random rand4 = new Random();
		int secret4 = rand4.nextInt(upperbound);
		
		if (difficulty == 1) {
			while (secret4 == secret1 || secret4 == secret2 || secret4 == secret3 || secret4 < 1) {
				secret4 = rand4.nextInt(upperbound);
			}
		}
		
		else if (difficulty == 2) {
				while (secret4 < 1) {
				secret4 = rand4.nextInt(upperbound);
				}
		}
		
		
		
		
		
		
		
		while (guess < 11 && finished == 0) {
			
			checker = 0;
			System.out.println("\n\nYou are on guess " + guess + "/10");
			
			System.out.println("\nColor 1:");
			choiceColor1 = sc.nextInt();
			
			
			if (difficulty == 1) {
				while (choiceColor1 > 6 || choiceColor1 < 1) {
					System.out.println("You can't put in a number above 6 or under 1");
					System.out.println("Color 1:");
					choiceColor1 = sc.nextInt();
				}
			}
			else if (difficulty == 2) {
				while (choiceColor1 > 6 || choiceColor1 < 1) {
					System.out.println("You can't put in a number above 6 or under 1");
					System.out.println("Color 1:");
					choiceColor1 = sc.nextInt();
				}
			}

			
			
			
			System.out.println("Color 2:");
			choiceColor2 = sc.nextInt();
			
			
			if (difficulty == 1) {
				while (choiceColor2 > 6 || choiceColor2 < 1 || choiceColor2 == choiceColor1) {
					if (choiceColor2 == choiceColor1) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
				}
			}
			else if (difficulty == 2) {
				while (choiceColor2 > 6 || choiceColor2 < 1) {
					if (choiceColor2 == choiceColor1) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
				}
			}
			
			
			
			
			System.out.println("Color 3:");
			choiceColor3 = sc.nextInt();
			
			
			if (difficulty == 1) {
				while (choiceColor3 > 6 || choiceColor3 < 1 || choiceColor3 == choiceColor1 || choiceColor3 == choiceColor2) {
					if (choiceColor3 == choiceColor1 || choiceColor3 == choiceColor2) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
				}
			}
			
			else if (difficulty == 2) {
				while (choiceColor3 > 6 || choiceColor3 < 1 ) {
					if (choiceColor3 == choiceColor1 || choiceColor3 == choiceColor2) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
				}
			}
			
			
			
			System.out.println("Color 4:");
			choiceColor4 = sc.nextInt();
			
			if (difficulty == 1) {
				while (choiceColor4 > 6 || choiceColor4 < 1 || choiceColor4 == choiceColor1 || choiceColor4 == choiceColor2 || choiceColor4 == choiceColor3) {
					if (choiceColor4 == choiceColor1 || choiceColor4 == choiceColor2 || choiceColor4 == choiceColor3) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 4:");
						choiceColor4 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 4:1");
						choiceColor4 = sc.nextInt();
					}
				}
			}
			
			else if (difficulty == 1) {
				while (choiceColor4 > 6 || choiceColor4 < 1) {
					if (choiceColor4 == choiceColor1 || choiceColor4 == choiceColor2 || choiceColor4 == choiceColor3) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 4:");
						choiceColor4 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 4:1");
						choiceColor4 = sc.nextInt();
					}
				}
			}
			
			
			
			
			if (choiceColor1 == secret1) {
				System.out.println("Color 1 is on the right place and is the right color.");
				checker = checker + 1;
			}
			else if (choiceColor1 == secret2 || choiceColor1 == secret3 || choiceColor1 == secret4) {
				System.out.println("Color 1 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 1 is not the right color neither is it in the right place.");
			}
			
			
			if (choiceColor2 == secret2) {
				System.out.println("Color 2 is on the right place and is the right color.");
				checker = checker + 1;
			}
			else if (choiceColor2 == secret1 || choiceColor2 == secret3 || choiceColor2 == secret4) {
				System.out.println("Color 2 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 2 is not the right color neither is it in the right place.");
			}
			
			
			if (choiceColor3 == secret3) {
				System.out.println("Color 3 is on the right place and is the right color.");
				checker = checker + 1;
			}
			else if (choiceColor3 == secret1 || choiceColor3 == secret2 || choiceColor3 == secret4) {
				System.out.println("Color 3 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 3 is not the right color neither is it in the right place.");
			}
			
			
			if (choiceColor4 == secret4) {
				System.out.println("Color 4 is on the right place and is the right color.");
				checker = checker + 1;
			}
			else if (choiceColor4 == secret1 || choiceColor4 == secret2 || choiceColor4 == secret3) {
				System.out.println("Color 4 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 4 is not the right color neither is it in the right place.");
			}
			
			
			
			
			
			
			if (checker >= 4) {
				System.out.println("All colors are correct!");
				finished = 1;
			}
			else {
				System.out.println("No or not all colors are correct, try again if you have guesses left!");
				guess = guess + 1;
			}
			
		}
		
		
		sc.close();
		
		/* shows the result if you have won or lost */
		
		if (guess != 10 && finished == 1) {
			System.out.println("You have won!");
		}
		else {
			System.out.println("You lost :(");
			System.out.println("the correct code was: " + secret1 + " " + secret2 + " " + secret3 + " " + secret4);
		}
	}

}
