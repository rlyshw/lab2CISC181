package pokar;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck myDeck = new Deck();
		for (Card i : myDeck.getCardArray()) {
			System.out.println(i.toString());
		}
		Hand myHand = new Hand(myDeck);
		System.out.println("My Hand");
		System.out.println(myHand.toString());
	}

}
