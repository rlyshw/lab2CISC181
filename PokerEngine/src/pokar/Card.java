package pokar;

public class Card {
	private int rank;
	private char suit;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public char getSuit() {
		return suit;
	}

	public void setSuit(char suit) {
		this.suit = suit;
	}

	public Card(int rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}
}
