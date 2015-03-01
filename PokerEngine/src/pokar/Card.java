package pokar;

public class Card implements Comparable{
	// In class bert said to use numerics for all variables. Rank should be 0=2,
	// 1=3, and so on with ace at the top I presume.
	
	//He said to use enumerators

	private CardRank rank;
	private Suit suit;

	public CardRank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public Card(CardRank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}

	@Override
	public int compareTo(Object b) {
		// TODO Auto-generated method stub
		if(this.getRank().getCardValue()==((Card) b).getRank().getCardValue()){
			return 0;
		}
		else if(this.getRank().getCardValue()<((Card) b).getRank().getCardValue()){
			return -1;
		}
		else if(this.getRank().getCardValue()>((Card) b).getRank().getCardValue()){
			return 1;
		}
		return 0;
	}}
