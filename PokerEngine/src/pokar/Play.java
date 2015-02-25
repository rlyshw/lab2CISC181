package pokar;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck myDeck = new Deck();
		myDeck.shuffle();
		for(Card i : myDeck.getCardArray()){
			System.out.println(i.toString());
		}
	}

}
