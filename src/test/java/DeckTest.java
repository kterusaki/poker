import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {

  private final static String[] SUITS = {"Diamonds", "Clubs", "Hearts", "Spades"};
  private Deck deck;

  @Before
  public void setUp() {
    deck = new Deck();
  }

  @Test
  public void testDeckInit() {
    HashMap<String, HashMap<Integer, Boolean>> deckHash = DeckTest.initDeckHash();
    assertTrue(testCompleteDeck(deck, deckHash));
  }

  @Test
  public void testDrawCard() {
    assertTrue(deck.drawCard().getClass().equals(Card.class));
  }

  @Test
  public void testDealCards() {
    assertThat(deck.dealCards(5).size(), is(5));
  }

  @Test
  public void testShuffle() {
    deck.shuffle();

    // 1. test that the cards are unsorted
    ArrayList<Card> deckArray = deck.toArray();
    boolean isSorted = true;

    for (int i = 0; i < 4; i++) {
      ArrayList<Card> subDeck = new ArrayList<Card>(deckArray.subList(i * 13, (i+1) * 13));

      for (int j = 0; j < 12; j++) {
        Card firstCard = subDeck.get(j);
        Card nextCard = subDeck.get(j+1);

        if (firstCard.getSuit() != nextCard.getSuit() || firstCard.getNum() >= nextCard.getNum()) {
          isSorted = false;
          break;
        }
      }
    }

    assertFalse(isSorted);

    // 2. test that all cards are still in the Deck
    HashMap<String, HashMap<Integer, Boolean>> deckHash = DeckTest.initDeckHash();
    assertTrue(testCompleteDeck(deck, deckHash));
  }

  @Test
  public void testReset() {
    Card c = deck.drawCard();
    deck.discard(c);
    deck.reset();

    HashMap<String, HashMap<Integer, Boolean>> deckHash = initDeckHash();
    assertTrue(testCompleteDeck(deck, deckHash));
    deck.reset();

    for (int i = 0; i < 2; i++) {
      c =	deck.drawCard();
      deck.discard(c);
    }

    deck.reset();
    deckHash = initDeckHash();
    assertTrue(testCompleteDeck(deck, deckHash));
  }

  @Test
  public void testToArray() {
    Deck deck = new Deck();
    ArrayList<Card> deckArray = deck.toArray();
    System.out.println(deckArray.getClass());
    assertTrue(deckArray.getClass().equals(ArrayList.class));
  }

  private static HashMap<String, HashMap<Integer, Boolean>> initDeckHash() {
    HashMap<String, HashMap<Integer, Boolean>> deckHash = new HashMap<String, HashMap<Integer, Boolean>>();

    for (int i = 0; i < SUITS.length; i++) {
      HashMap<Integer, Boolean> suitMap = new HashMap<Integer, Boolean>();
      for (int j = 1; j < 14; j++) {
        suitMap.put(new Integer(j), Boolean.valueOf(false));
      }
      deckHash.put(SUITS[i], suitMap);
    }

    return deckHash;
  }

  private boolean testCompleteDeck(Deck deck, HashMap<String, HashMap<Integer, Boolean>> deckHash) {
    for (int i = 0; i < 52; i++) {
      Card card = deck.drawCard();
      deck.discard(card);
      HashMap<Integer, Boolean> cardMap = deckHash.get(card.getSuit());
      int cardNum = card.getNum();
      cardMap.put(cardNum, true);
    }

    for (int i = 0; i < 4; i++) {
      HashMap<Integer, Boolean> cardMap = deckHash.get(SUITS[i]);
      Iterator<Integer> iter = cardMap.keySet().iterator();

      while (iter.hasNext()) {
        int num = iter.next();

        boolean hasNum = cardMap.get(num);
        if (hasNum == false) {
          return false;
        }
      }
    }

    return true;
  }
}