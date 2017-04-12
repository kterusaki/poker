import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PokerHandTest {

  private PokerHand pair;
  private PokerHand twoPair;
  private PokerHand threeOfAKind;
  private PokerHand straight;
  private PokerHand flush;
  private PokerHand fullHouse;
  private PokerHand fourOfAKind;
  private PokerHand straightFlush;
  private PokerHand royalFlush;

  @Before
  public void setUp() {
    pair = pair();
    twoPair = twoPair();
    threeOfAKind = threeOfAKind();
    straight = straight();
    flush = flush();
    fullHouse = fullHouse();
    fourOfAKind = fourOfAKind();
    straightFlush = straightFlush();
    royalFlush = royalFlush();
  }

  @Ignore @Test
  public void testAddCards() {
  }

  @Test
  public void testIsPair() {
    System.out.println(pair);
    assertTrue(pair.isPair());
    assertFalse(straight.isPair());
  }

  @Test
  public void testIsTwoPair() {
    assertTrue(twoPair.isTwoPair());
    assertFalse(pair.isTwoPair());
  }

  @Test
  public void testIsThreeOfAKind() {
    assertTrue(threeOfAKind.isThreeOfAKind());
    assertFalse(pair.isThreeOfAKind());
  }

  @Ignore @Test
  public void testIsStraight() {
    assertTrue(straight.isStraight());
    assertFalse(pair.isStraight());
  }

  @Ignore @Test
  public void testIsFlush() {
    assertTrue(flush.isFlush());
    assertTrue(pair.isFlush());
  }

  @Test
  public void testIsFullHouse() {
    assertTrue(fullHouse.isFullHouse());
    assertFalse(threeOfAKind.isFullHouse());
  }

  @Test
  public void testIsFourOfAKind() {
    assertTrue(fourOfAKind.isFourOfAKind());
    assertFalse(fullHouse.isFourOfAKind());
  }

  @Ignore @Test
  public void testIsStraightFlush() {
    assertTrue(straightFlush.isStraightFlush());
    assertFalse(straight.isStraightFlush());
    assertFalse(flush.isStraightFlush());
  }

  @Ignore @Test
  public void testIsRoyalFlush() {
    assertTrue(royalFlush.isRoyalFlush());
    assertFalse(straight.isRoyalFlush());
    assertFalse(flush.isRoyalFlush());
    assertFalse(straightFlush.isRoyalFlush());
  }

  private PokerHand pair() {
    ArrayList<Card> hand = new ArrayList<Card>();
    try {
      hand.add(new Card("Diamonds", 1));
      hand.add(new Card("Clubs", 1));
      hand.add(new Card("Diamonds", 7));
      hand.add(new Card("Hearts", 10));
      hand.add(new Card("Spades", 13));
      hand.add(new Card("Spades", 5));
      hand.add(new Card("Clubs", 9));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand twoPair() {
    ArrayList<Card> hand = new ArrayList<Card>();
    try {
      hand.add(new Card("Diamonds", 1));
      hand.add(new Card("Clubs", 1));
      hand.add(new Card("Hearts", 10));
      hand.add(new Card("Clubs", 10));
      hand.add(new Card("Diamonds", 13));
      hand.add(new Card("Spades", 13));
      hand.add(new Card("Clubs", 3));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand threeOfAKind() {
    ArrayList<Card> hand = new ArrayList<Card>();
    try {
      hand.add(new Card("Diamonds", 1));
      hand.add(new Card("Clubs", 1));
      hand.add(new Card("Hearts", 1));
      hand.add(new Card("Diamonds", 7));
      hand.add(new Card("Hearts", 8));
      hand.add(new Card("Spades", 13));
      hand.add(new Card("Spades", 12));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand straight() {
    ArrayList<Card> hand = new ArrayList<Card>();

    try {
      hand.add(new Card("Diamonds", 1));
      hand.add(new Card("Clubs", 2));
      hand.add(new Card("Diamonds", 3));
      hand.add(new Card("Hearts", 4));
      hand.add(new Card("Spades", 5));
      hand.add(new Card("Spades", 10));
      hand.add(new Card("Hearts", 11));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand flush() {
    ArrayList<Card> hand = new ArrayList<Card>();

    try {
      hand.add(new Card("Clubs", 1));
      hand.add(new Card("Clubs", 6));
      hand.add(new Card("Clubs", 7));
      hand.add(new Card("Clubs", 10));
      hand.add(new Card("Clubs", 13));
      hand.add(new Card("Hearts", 2));
      hand.add(new Card("Hearts", 4));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand fullHouse() {
    ArrayList<Card> hand = new ArrayList<Card>();

    try {
      hand.add(new Card("Diamonds", 1));
      hand.add(new Card("Clubs", 1));
      hand.add(new Card("Diamonds", 7));
      hand.add(new Card("Hearts", 1));
      hand.add(new Card("Spades", 7));
      hand.add(new Card("Spades", 13));
      hand.add(new Card("Hearts", 10));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand fourOfAKind() {
    ArrayList<Card> hand = new ArrayList<Card>();

    try {
      hand.add(new Card("Diamonds", 1));
      hand.add(new Card("Clubs", 7));
      hand.add(new Card("Diamonds", 7));
      hand.add(new Card("Hearts", 7));
      hand.add(new Card("Spades", 7));
      hand.add(new Card("Spades", 5));
      hand.add(new Card("Hearts", 11));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand straightFlush() {
    ArrayList<Card> hand = new ArrayList<Card>();

    try {
      hand.add(new Card("Diamonds", 2));
      hand.add(new Card("Diamonds", 3));
      hand.add(new Card("Diamonds", 4));
      hand.add(new Card("Diamonds", 5));
      hand.add(new Card("Diamonds", 6));
      hand.add(new Card("Clubs", 11));
      hand.add(new Card("Clubs", 13));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }

  private PokerHand royalFlush() {
    ArrayList<Card> hand = new ArrayList<Card>();

    try {
      hand.add(new Card("Hearts", 10));
      hand.add(new Card("Hearts", 11));
      hand.add(new Card("Hearts", 12));
      hand.add(new Card("Hearts", 13));
      hand.add(new Card("Hearts", 1));
      hand.add(new Card("Spades", 4));
      hand.add(new Card("Clubs", 5));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }
}