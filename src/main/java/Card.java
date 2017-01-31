import java.util.*;

public class Card {

  private String suit;
  private int number;
  private static final HashMap<Integer, String> faceCardMap;
  private static final ArrayList<String> SUITS;

  static {
    faceCardMap = new HashMap<Integer, String>();
    faceCardMap.put(1, "A");
    faceCardMap.put(11, "J");
    faceCardMap.put(12, "Q");
    faceCardMap.put(13, "K");

    SUITS = new ArrayList<String>();
    SUITS.add("Diamonds");
    SUITS.add("Clubs");
    SUITS.add("Hearts");
    SUITS.add("Spades");
  }

  public Card(String suit, int number) throws Exception {
    if (!SUITS.contains(suit)) {
      throw new Exception("Invalid Suit: card must have a suit of Diamonds, Clubs, Hearts, or Spades");
    }

    this.suit = suit;
    this.number = number;
  }

  public String getSuit() {
    return suit;
  }

  public int getNum() {
    return number;
  }

  @Override
  public String toString() {
    String numChar = number > 10 || number == 1 ? faceCardMap.get(number) : String.valueOf(number);

    return suit + " - " + numChar;
  }

  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    }

    if (!Card.class.isAssignableFrom(other.getClass())) {
      return false;
    }

    final Card card = (Card)other;

    if (card.getSuit() == this.suit && card.getNum() == this.number) {
      return true;
    } else {
      return false;
    }
  }
}