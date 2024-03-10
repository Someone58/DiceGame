package DiceGame;

public class GamePlayer {

	private int points = 0;


		public int getPoints(int plus) {
			return points + plus;
		}
		public int rollTheDice(int points) {
			return points = (int) (Math.random() * 6 + 1);

		}
}