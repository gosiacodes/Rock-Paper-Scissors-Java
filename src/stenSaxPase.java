import java.util.Scanner;

public class stenSaxPase {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int scoresPlayer1 = 0;
		int scoresPlayer2 = 0;
		String rock = "rock";
		String paper = "paper";
		String scissors = "scissors";
		
		while (i < 5) {
			System.out.println("1. rock, 2. paper 3. scissors");
			System.out.println("Player 1, choose 1, 2 or 3: ");
			String inputPlayer1 = scan.nextLine();
			System.out.println("Player 2, choose 1, 2 or 3: ");
			String inputPlayer2 = scan.nextLine();
		
			if (inputPlayer1.equals("1") && inputPlayer2.equals(rock) || 
					inputPlayer1.equals("1") && inputPlayer2.equals(paper) || 
					inputPlayer1.equals("1") && inputPlayer2.equals(scissors) ||
					inputPlayer1.equals("2") && inputPlayer2.equals(rock) || 
					inputPlayer1.equals("2") && inputPlayer2.equals(paper) || 
					inputPlayer1.equals("2") && inputPlayer2.equals(scissors) ||
					inputPlayer1.equals("3") && inputPlayer2.equals(rock) || 
					inputPlayer1.equals("3") && inputPlayer2.equals(paper) || 
					inputPlayer1.equals("3") && inputPlayer2.equals(scissors) ||
					inputPlayer1.equals(rock) && inputPlayer2.equals("1") || 
					inputPlayer1.equals(rock) && inputPlayer2.equals("2") ||
					inputPlayer1.equals(rock) && inputPlayer2.equals("3") || 
					inputPlayer1.equals(paper) && inputPlayer2.equals("1") || 
					inputPlayer1.equals(paper) && inputPlayer2.equals("2") ||
					inputPlayer1.equals(paper) && inputPlayer2.equals("3") || 
					inputPlayer1.equals(scissors) && inputPlayer2.equals("1") || 
					inputPlayer1.equals(scissors) && inputPlayer2.equals("2") ||
					inputPlayer1.equals(scissors) && inputPlayer2.equals("3")) {
				System.out.println("You must choose whether you write in numbers or text.");
				i--;
			}
		
			else if (inputPlayer1.equals(rock) || inputPlayer1.equals(paper) || inputPlayer1.equals(scissors) &&
					inputPlayer2.equals(rock) || inputPlayer2.equals(paper) || inputPlayer2.equals(scissors)) {
				
				if (inputPlayer1.equals(rock) && inputPlayer2.equals(rock)) {
					System.out.println("Player 1 and Player 2 - score draw.");
				}
				else if (inputPlayer1.equals(rock) && inputPlayer2.equals(paper)) {
					System.out.println("Player 2 winns.");
					scoresPlayer2++;
				}
				else if (inputPlayer1.equals(rock) && inputPlayer2.equals(scissors)) {
					System.out.println("Player 1 winns.");
					scoresPlayer1++;
				}
				else if (inputPlayer1.equals(paper) && inputPlayer2.equals(rock)) {
					System.out.println("Player 1 winns.");
					scoresPlayer1++;
				}
				else if (inputPlayer1.equals(paper) && inputPlayer2.equals(paper)) {
					System.out.println("Player 1 and Player 2 - score draw.");
				}
				else if (inputPlayer1.equals(paper) && inputPlayer2.equals(scissors)) {
					System.out.println("Player 2 winns.");
					scoresPlayer2++;
				}
				else if (inputPlayer1.equals(scissors) && inputPlayer2.equals(rock)) {
					System.out.println("Player 2 winns.");
					scoresPlayer2++;
				}
				else if (inputPlayer1.equals(scissors) && inputPlayer2.equals(paper)) {
					System.out.println("Player 1 winns.");
					scoresPlayer1++;
				}
				else if (inputPlayer1.equals(scissors) && inputPlayer2.equals(scissors)) {
					System.out.println("Player 1 and Player 2 - score draw.");
				}
				else {
					System.out.println("You have to choose correct values!");
					i--;
				}
			}
						
			else if (inputPlayer1.equals("1") || inputPlayer1.equals("2") || inputPlayer1.equals("3") &&
					inputPlayer2.equals("1") || inputPlayer2.equals("2") || inputPlayer2.equals("3")) {
				
				try {
		
					int choicePlayer1 = Integer.valueOf(inputPlayer1);
					int choicePlayer2 = Integer.valueOf(inputPlayer2);
					
					if (choicePlayer1 > 0 && choicePlayer1 < 4 && choicePlayer2 > 0 && choicePlayer2 < 4) {
					
						if (choicePlayer1 == choicePlayer2) {
							System.out.println("Player 1 and Player 2 - score draw.");
						}
						else if (choicePlayer1 == 1 && choicePlayer2 == 2) {
							System.out.println("Player 2 winns.");
							scoresPlayer2++;
						}
						else if (choicePlayer1 == 1 && choicePlayer2 == 3) {
							System.out.println("Player 1 winns.");
							scoresPlayer1++;
						}
						else if (choicePlayer1 == 2 && choicePlayer2 == 1) {
							System.out.println("Player 1 winns.");
							scoresPlayer1++;
						}						
						else if (choicePlayer1 == 2 && choicePlayer2 == 3) {
							System.out.println("Player 2 winns.");
							scoresPlayer2++;
						}
						else if (choicePlayer1 == 3 && choicePlayer2 == 1) {
							System.out.println("Player 2 winns.");
							scoresPlayer2++;
						}
						else if (choicePlayer1 == 3 && choicePlayer2 == 2) {
							System.out.println("Player 1 winns.");
							scoresPlayer1++;
						}						
					}
					else {
						System.out.println("You must choose 1, 2 or 3.");
						i--;
					}
				}
				
				catch (NumberFormatException e) {
					System.out.println("You must choose whether you write in numbers or text.");
					i--;
				}
			}
			i++;
		}
		
		String winner = "";
		
		if (scoresPlayer1 > scoresPlayer2) {
			winner = "The winner is: Player 1.";
		}
		else if (scoresPlayer1 < scoresPlayer2) {
			winner = "The winner is: Player 2.";
		}
		else if (scoresPlayer1 == scoresPlayer2) {
			winner = "Player 1 and Player 2 - score draw.";
		}
		
		if (i == 5) {
			System.out.println("Player 1: " + scoresPlayer1 + " points. Player 2: " + scoresPlayer2 + " points. " + winner);
		}
		
	}
}
