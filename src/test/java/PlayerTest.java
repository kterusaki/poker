import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

  private Player p;

  @Before
  public void setUp() {
    p = new Player("Johnny Chan");
  }

  @Test
  public void testPlayerInit() {
    assertNotNull(p);
    assertEquals(0, p.getChips());
    assertEquals("Johnny Chan", p.getName());
    assertEquals(0, p.getHand().size());
  }

  @Test
  public void testGetName() {
    assertEquals("Johnny Chan", p.getName());
  }

  @Test
  public void testViewHand() {
    assertEquals(0, p.getHand().size());
  }

  @Test
  public void testSetHand() {
    Deck deck = new Deck();
    p.setHand(deck.dealCards(2));
  }

  @Test
  public void testChips() {
    assertEquals(0, p.getChips());
  }

  @Test
  public void testAddChips() {
    p.addChips(10);
    assertEquals(10, p.getChips());
  }

  @Test
  public void testSubtractChips() {
    p.addChips(100);

    try {
      p.subtractChips(10);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    assertEquals(90, p.getChips());
  }

  @Test
  public void testThrownException() {
    p.addChips(10);

    try {
      p.subtractChips(20);
      fail();
    } catch (Exception e) {
      assertNotNull(e);
      assertEquals("Invalid Balance: balance can not be negative", e.getMessage());
    }

  }
}
