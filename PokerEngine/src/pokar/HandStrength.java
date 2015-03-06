package pokar;

public enum HandStrength {
	NOPAIR(2),
	ONEPAIR(3),
	TWOPAIR(4),
	STRAIGHT(5),
	FLUSH(6),
	FULLHOUSE(7),
	FOUROFAKIND(8),
	STRAIGHTFLUSH(9),
	FIVEOFAKIND(10),
	ROYALFLUSH(11);
	
	private int handStrength;

	private HandStrength(int handStrength){
		this.handStrength = handStrength;
	
	}
	public int gethandStrength(){
		return handStrength;
	}
	

	
	

}
