import static org.junit.Assert.*;
import org.junit.Test;

public class CardTest {
  private final String[] SUITS = { "Diamonds", "Clubs", "Hearts", "Spades" };

  @Test
  public void testCardInit() {
    for (int i = 0; i < 4; i++) {
      for (int j = 1; j < 14; j++) {
        try {
          Card card = new Card(SUITS[i], j);
          assertEquals(SUITS[i], card.getSuit());
          assertEquals(j, card.getNum());
        } catch (Exception e) {
          fail(e.getMessage());
        }
      }
    }
  }

  @Test
  public void testThrownException() {
    try {
      Card card = new Card("Circles", 5);
    } catch (Exception e) {
      assertNotNull(e);
      assertEquals("Invalid Suit: card must have a suit of Diamonds, Clubs, Hearts, or Spades", e.getMessage());
    }
  }

  @Test
  public void testGetSuit() {
    try {
      Card card = new Card("Diamonds", 1);
      assertEquals("Diamonds", card.getSuit());
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }

  @Test
  public void testGetNum() {
    try {
      Card card = new Card("Diamonds", 1);
      assertEquals(1, card.getNum());
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }

  @Test
  public void testToString() {
    try {
      Card card = new Card("Diamonds", 1);
      assertEquals("Diamonds - A", card.toString());
      card = new Card("Clubs", 5);
      assertEquals("Clubs - 5", card.toString());
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }

  @Test
  public void testEquals() {
    try {
      Card firstCard = new Card("Diamonds", 1);
      Card secondCard = new Card("Diamonds", 1);
      assertTrue(firstCard.equals(secondCard));

      Card thirdCard = new Card("Clubs", 1);
      assertFalse(firstCard.equals(thirdCard));
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
}