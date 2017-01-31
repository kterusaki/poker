import org.junit.Before;
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

  @Test
  public void testIsPair() {
    assertTrue(pair.isPair());
    assertFalse(pair.isPair(twoPair));
    assertFalse(pair.isPair(threeOfAKind));
  }
//
//  @Test
//  public void testIsTwoPair() {
//    assertTrue(PokerHand.isTwoPair(twoPair));
//    assertFalse(PokerHand.isTwoPair(pair));
//  }
//
//  @Test
//  public void testIsThreeOfAKind() {
//    assertTrue(PokerHand.isThreeOfAKind(threeOfAKind));
//    assertFalse(PokerHand.isThreeOfAKind(pair));
//  }
//
//  @Test
//  public void testIsStraight() {
//    assertTrue(PokerHand.isStraight(straight));
//    assertFalse(PokerHand.isStraight(pair));
//  }
//
//  @Test
//  public void testIsFlush() {
//    assertTrue(PokerHand.isFlush(flush));
//    assertTrue(PokerHand.isFlush(pair));
//  }
//
//  @Test
//  public void testIsFullHouse() {
//    assertTrue(PokerHand.isFullHouse(fullHouse));
//    assertFalse(PokerHand.isFullHouse(straight));
//  }
//
//  @Test
//  public void testIsFourOfAKind() {
//    assertTrue(PokerHand.isFourOfAKind(fourOfAKind));
//    assertFalse(PokerHand.isFourOfAKind(fullHouse));
//  }
//
//  @Test
//  public void testIsStraightFlush() {
//    assertTrue(PokerHand.isStraightFlush(straightFlush));
//    assertFalse(PokerHand.isStraightFlush(straight));
//    assertFalse(PokerHand.isStraightFlush(flush));
//  }
//
//  @Test
//  public void testIsRoyalFlush() {
//    assertTrue(PokerHand.isRoyalFlush(royalFlush));
//    assertFalse(PokerHand.isRoyalFlush(straight));
//    assertFalse(PokerHand.isRoyalFlush(straightFlush));
//    assertFalse(PokerHand.isRoyalFlush(flush));
//  }

  private PokerHand pair() {
    ArrayList<Card> hand = new ArrayList<Card>();
    try {
      hand.add(new Card("Diamonds", 1));
      hand.add(new Card("Clubs", 1));
      hand.add(new Card("Diamonds", 7));
      hand.add(new Card("Hearts", 10));
      hand.add(new Card("Spades", 13));
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
      hand.add(new Card("Diamonds", 13));
      hand.add(new Card("Hearts", 10));
      hand.add(new Card("Spades", 13));
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
      hand.add(new Card("Diamonds", 7));
      hand.add(new Card("Hearts", 1));
      hand.add(new Card("Spades", 13));
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
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return new PokerHand(hand);
  }
}