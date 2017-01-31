import java.util.*;

public class PokerHand {

  private ArrayList<Card> hand;
  private HashMap<Integer, ArrayList<Card>> countHash;

  public PokerHand(Collection<Card> cards) {
    hand = (ArrayList<Card>) cards;
  }


  public static boolean isPair(Collection<Card> hand) {
    HashMap<Integer, ArrayList<Card>> countHash = initCountHash(hand);

    for (Map.Entry<Integer, ArrayList<Card>> entry : countHash.entrySet()) {
      if (entry.getValue().size() >= 2) {
        return true;
      }
    }

    return false;
  }




  // TODO: Create new class that inherits from hashmap. Will be able to return the Key when containsValue is used
  //       Will also be able to return the highest integer with count > 1
  public static Collection<Card> getPair(Collection<Card> hand) {
//    HashMap<Integer, ArrayList<Card>> countHash = initCountHash(hand);
//
//
//    for (Map.Entry<Integer, Integer> entry : countHash.entrySet()) {
//      Integer key = entry.getKey();
//      Integer value = entry.getValue();
//
////      if (value == 2) {
////
////      }
//    }
    return hand;
  }

  public static boolean isTwoPair(Collection<Card> hand) {

    return true;
  }

  public static boolean isThreeOfAKind(Collection<Card> c) {
    return true;
  }

  public static boolean isStraight(Collection<Card> c) {
    return true;
  }

  public static boolean isFlush(Collection<Card> c) {
    return true;
  }

  public static boolean isFullHouse(Collection<Card> c) {
    return true;
  }

  public static boolean isFourOfAKind(Collection<Card> c) {
    return true;
  }

  public static boolean isStraightFlush(Collection<Card> c) {
    return true;
  }

  public static boolean isRoyalFlush(Collection<Card> c) {
    return true;
  }

  private static HashMap<String, ArrayList<Integer>> initHandHash(Collection<Card> hand) {
    HashMap<String, ArrayList<Integer>> handHash = new HashMap<String, ArrayList<Integer>>();

    for (Card c : hand) {
      if (!handHash.containsKey(c.getSuit())) {
        handHash.put(c.getSuit(), new ArrayList<Integer>());
      }

      handHash.get(c.getSuit()).add(c.getNum());
    }

    return handHash;
  }

  private static HashMap<Integer, ArrayList<Card>> initCountHash(Collection<Card> hand) {
    HashMap<Integer, ArrayList<Card>> countHash = new HashMap<Integer, ArrayList<Card>>();

    for (Card card : hand) {
      if (!countHash.containsKey(card.getNum())) {
        countHash.put(card.getNum(), new ArrayList<Card>());
      }

      countHash.get(card.getNum()).add(card);
    }

    return countHash;
  }
}