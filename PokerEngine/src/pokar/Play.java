package pokar;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck myDeck = new Deck();
		for (Card i : myDeck.getCardArray()) {
			System.out.println(i.toString());
		}
		Hand myHand = new Hand(myDeck);
		
		System.out.println("My Hand(unsorted)");
		System.out.println(myHand.toString());
		
		System.out.println("Hand Score: "+Hand.judgeHand(myHand));
		System.out.println("My Hand(sorted?)");
		System.out.println(myHand.toString());
	}

}
