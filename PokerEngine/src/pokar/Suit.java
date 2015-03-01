package pokar;

public enum Suit {
	//enum is like a dictionary but it's a class or something
	CLUBS(0),
	DIAMONDS(1),
	HEARTS(2),
	SPADES(3);
	
	private int suitRank;
	
	private Suit(int value){
		this.suitRank = value;
	}
	public int getsuitRank(){
		return suitRank;
	}
}
