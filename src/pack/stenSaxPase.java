package pack;

import java.util.Scanner;

public class stenSaxPase {

	static int i = 0;
	static int scoresPlayer1 = 0;
	static int scoresPlayer2 = 0;
	static String rock = "rock";
	static String paper = "paper";
	static String scissors = "scissors";

	public static int getI() {
		return i;
	}

	public static int getScoresPlayer1() {
		return scoresPlayer1;
	}

	public static int getScoresPlayer2() {
		return scoresPlayer2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (i < 5) {
			System.out.println("1. rock, 2. paper 3. scissors");
			System.out.println("Player 1, choose 1, 2 or 3: ");
			String inputPlayer1 = scan.nextLine();
			System.out.println("Player 2, choose 1, 2 or 3: ");
			String inputPlayer2 = scan.nextLine();

			int playerOneClean = stringCheck(inputPlayer1);
			System.out.println(playerOneClean);
			int playerTwoClean = stringCheck(inputPlayer2);
			System.out.println(playerTwoClean);
			if (playerOneClean == 0 || playerTwoClean == 0) {
				i--;
			}

			if (inputPlayer1.equals(rock) || inputPlayer1.equals(paper)
					|| inputPlayer1.equals(scissors) && inputPlayer2.equals(rock) || inputPlayer2.equals(paper)
					|| inputPlayer2.equals(scissors)) {

				if (inputPlayer1.equals(rock) && inputPlayer2.equals(rock)) {
					System.out.println("Player 1 and Player 2 - score draw.");
				} else if (inputPlayer1.equals(rock) && inputPlayer2.equals(paper)) {
					System.out.println("Player 2 winns.");
					scoresPlayer2++;
				} else if (inputPlayer1.equals(rock) && inputPlayer2.equals(scissors)) {
					System.out.println("Player 1 winns.");
					scoresPlayer1++;
				} else if (inputPlayer1.equals(paper) && inputPlayer2.equals(rock)) {
					System.out.println("Player 1 winns.");
					scoresPlayer1++;
				} else if (inputPlayer1.equals(paper) && inputPlayer2.equals(paper)) {
					System.out.println("Player 1 and Player 2 - score draw.");
				} else if (inputPlayer1.equals(paper) && inputPlayer2.equals(scissors)) {
					System.out.println("Player 2 winns.");
					scoresPlayer2++;
				} else if (inputPlayer1.equals(scissors) && inputPlayer2.equals(rock)) {
					System.out.println("Player 2 winns.");
					scoresPlayer2++;
				} else if (inputPlayer1.equals(scissors) && inputPlayer2.equals(paper)) {
					System.out.println("Player 1 winns.");
					scoresPlayer1++;
				} else if (inputPlayer1.equals(scissors) && inputPlayer2.equals(scissors)) {
					System.out.println("Player 1 and Player 2 - score draw.");
				} else {
					System.out.println("You have to choose correct values!");
					i--;
				}
			}

			else if (inputPlayer1.equals("1") || inputPlayer1.equals("2")
					|| inputPlayer1.equals("3") && inputPlayer2.equals("1") || inputPlayer2.equals("2")
					|| inputPlayer2.equals("3")) {

				try {

					int choicePlayer1 = Integer.valueOf(inputPlayer1);
					int choicePlayer2 = Integer.valueOf(inputPlayer2);

					if (choicePlayer1 > 0 && choicePlayer1 < 4 && choicePlayer2 > 0 && choicePlayer2 < 4) {

						if (choicePlayer1 == choicePlayer2) {
							System.out.println("Player 1 and Player 2 - score draw.");
						} else if (choicePlayer1 == 1 && choicePlayer2 == 2) {
							System.out.println("Player 2 winns.");
							scoresPlayer2++;
						} else if (choicePlayer1 == 1 && choicePlayer2 == 3) {
							System.out.println("Player 1 winns.");
							scoresPlayer1++;
						} else if (choicePlayer1 == 2 && choicePlayer2 == 1) {
							System.out.println("Player 1 winns.");
							scoresPlayer1++;
						} else if (choicePlayer1 == 2 && choicePlayer2 == 3) {
							System.out.println("Player 2 winns.");
							scoresPlayer2++;
						} else if (choicePlayer1 == 3 && choicePlayer2 == 1) {
							System.out.println("Player 2 winns.");
							scoresPlayer2++;
						} else if (choicePlayer1 == 3 && choicePlayer2 == 2) {
							System.out.println("Player 1 winns.");
							scoresPlayer1++;
						}
					} else {
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
		new result();

		scan.close();

	}

	static int stringCheck(String s) {

		int stingState = 0;
		try {
			stingState = Integer.parseInt(s);

		} catch (NumberFormatException e) {

			switch (s.toLowerCase()) {
			case "rock":
				stingState = 1;
				break;
			case "paper":
				stingState = 2;
				break;
			case "scissor":
				stingState = 3;
				break;
			default:
				System.out.println("Player input not valid:" + s + " , String");
				stingState = 0;

			}

		}

		if (stingState < 1 || stingState > 3) {
			System.out.println("Player input not valid:" + s + " , Number");
			stingState = 0;

		}

		return stingState;

	}

}
