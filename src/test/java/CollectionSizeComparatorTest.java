import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CollectionSizeComparatorTest {

  @Test
  public void testCompare() {
    ArrayList<Card> smallList = new ArrayList<Card>();
    ArrayList<Card> mediumList = new ArrayList<Card>();
    ArrayList<Card> largeList = new ArrayList<Card>();

    Deck deck = new Deck();
    for (int i = 0; i < 10; i++) {
      Card card = deck.drawCard();

      if (i < 4) {
        smallList.add(card);
      }

      if (i < 6) {
        mediumList.add(card);
      }

      largeList.add(card);
    }

    ArrayList<ArrayList<Card>> lists = new ArrayList<ArrayList<Card>>();
    lists.add(smallList);
    lists.add(mediumList);
    lists.add(largeList);
    Collections.sort(lists, new CollectionSizeComparator());

    for (int i = 0; i < lists.size(); i++) {
      if (i + 1 < lists.size()) {
        assertTrue(lists.get(i).size() >= lists.get(i + 1).size());
      }
    }
  }
}
