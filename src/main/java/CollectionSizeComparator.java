import java.util.*;

public class CollectionSizeComparator implements Comparator<Collection<Card>> {

  public int compare(Collection<Card> c1, Collection<Card> c2) {
    if (c1 == null || c2 == null) {
      throw new NullPointerException();
    }

    if (c1.size() > c2.size()) {
      return -1;
    } else if (c1.size() == c2.size()) {
      // TODO: Think about whether there should be no instance of tie breakers
      //       e.g. if count is the same, check the card number and prioritize based off card number
      return 0;
    } else {
      return 1;
    }
  }
}
