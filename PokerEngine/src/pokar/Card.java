package pokar;

public class Card {
	private int rank;
	private char suit;

	private boolean avail = true; // This variable determines if the card is
									// drawn from the deck

	public int getRank() {
		return rank;
	}

	// dont have to set rank

	public char getSuit() {
		return suit;
	}

	// removed setter, we don't have to change the suit of the card once it is
	// constructed

	public Card(int rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}

	public boolean isAvail() {
		return true;
	}
}
