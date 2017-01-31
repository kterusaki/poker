import java.util.*;

public class Notepad {

  public static void main(String args[]) {
    HashMap<Card, Integer>  countHash = new HashMap<Card, Integer>();

    try {
      Card card = new Card("Diamonds", 1);
      countHash.put(card, 1);

      for (Card c : countHash.keySet()) {
        System.out.println(c);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
