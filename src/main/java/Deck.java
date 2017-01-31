import static java.lang.System.out;
import java.lang.Math;
import java.util.*;

public class Deck {

  private LinkedList<Card> cards;
  private ArrayList<Card> discardPile;

  private final String[] SUITS = {"Diamonds", "Clubs", "Hearts", "Spades"};

  public Deck() {
    cards = new LinkedList<Card>();
    discardPile = new ArrayList<Card>();

    for (int i = 0; i < 4; i++) {
      for (int j = 1; j < 14; j++) {
        try {
          Card card = new Card(SUITS[i], j);
          cards.add(card);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
      }
    }
  }

  public Card drawCard() {
    return cards.poll();
  }

  public ArrayList<Card> dealCards(int numCards) {
    ArrayList<Card> hand = new ArrayList<Card>();
    for (int i = 0; i < numCards; i++) {
      hand.add(this.drawCard());
    }

    return hand;
  }

  // TODO: Add method dealCard that takes an int and returns an ArrayList<Card> with size = to int parameter

  public void discard(Card c) {
    discardPile.add(c);
  }

  public void discard(Collection<Card> cards) {
    discardPile.addAll(cards);
  }

  public void reset() {
    cards.addAll(discardPile);
    discardPile.clear();
    shuffle();
  }

  public void shuffle() {
    for (int i = 0; i < cards.size(); i++) {
      int secondIndex = (int)Math.ceil(Math.random() * cards.size()-1);
      swap(i, secondIndex);
    }
  }

  private void swap(int firstIndex, int secondIndex) {
    Card temp = cards.get(secondIndex);
    cards.set(secondIndex, cards.get(firstIndex));
    cards.set(firstIndex, temp);
  }

  public ArrayList<Card> toArray() {
    ArrayList<Card> cardsArray = new ArrayList<Card>();
    Iterator<Card> iter = cards.iterator();
    while (iter.hasNext()) {
      Card c = iter.next();
      cardsArray.add(c);
    }

    return cardsArray;
  }
}
