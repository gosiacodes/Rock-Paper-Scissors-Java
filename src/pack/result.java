package pack;

public class result {

	public result() {

		String winner = "";

		if (stenSaxPase.getScoresPlayer1() > stenSaxPase.getScoresPlayer2()) {
			winner = "The winner is: Player 1.";
		} else if (stenSaxPase.getScoresPlayer1() < stenSaxPase.getScoresPlayer2()) {
			winner = "The winner is: Player 2.";
		} else if (stenSaxPase.getScoresPlayer1() == stenSaxPase.getScoresPlayer2())
			;
		{
			winner = "Player 1 and Player 2 - score draw.";
		}

		if (stenSaxPase.getI() == 5) {
			System.out.println("Player 1: " + stenSaxPase.getScoresPlayer1() + " points. Player 2: "
					+ stenSaxPase.getScoresPlayer2() + " points. " + winner);
		}
	}

}
