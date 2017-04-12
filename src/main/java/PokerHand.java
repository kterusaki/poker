import java.util.*;

public class PokerHand {

  private ArrayList<Card> hand;
  private HashMap<Integer, ArrayList<Card>> cardHash;
  private PriorityQueue<ArrayList<Card>> cardCountPQ;

  public PokerHand() {
    hand = new ArrayList<>();
    cardHash = new HashMap<>();
    cardCountPQ = new PriorityQueue<>(new CollectionSizeComparator());
  }

  public PokerHand(Collection<Card> cards) {
    hand = (ArrayList<Card>) cards;
    cardHash = new HashMap<>();
    cardCountPQ = new PriorityQueue<>(new CollectionSizeComparator());

    for (Card card : hand) {
      if (!cardHash.containsKey(card.getNum())) {
        ArrayList<Card> equalNumCardArray = new ArrayList<>();
        cardHash.put(card.getNum(), equalNumCardArray);
        cardCountPQ.add(equalNumCardArray);
      }

      cardHash.get(card.getNum()).add(card);
    }
  }

  // TODO: Create method for adding additional cards to PokerHand
  //       1) Card gets added to Poker Hand
  //       2) Add to hand
  //       3) Check key exists for number on card in cardHash
  //       4) If key does not exist, create new arrayList and insert into cardHash
  //       5) Insert same arrayList into PQ

  public boolean isPair() {
    Iterator<ArrayList<Card>> iter = cardCountPQ.iterator();
    while (iter.hasNext()) {
      if (iter.next().size() == 2) {
        return true;
      }
    }

    return false;
  }

  public boolean isTwoPair() {
    Iterator<ArrayList<Card>> iter = cardCountPQ.iterator();
    int numPairs = 0;
    while (iter.hasNext()) {
      if (iter.next().size() == 2) {
        numPairs++;
      }
    }

    return numPairs >= 2;
  }

  public boolean isThreeOfAKind() {
    Iterator<ArrayList<Card>> iter = cardCountPQ.iterator();
    while (iter.hasNext()) {
      if (iter.next().size() == 3) {
        return true;
      }
    }

    return false;
  }

  public boolean isStraight() {
    return true;
  }

  public boolean isFlush() {
    return true;
  }

  public boolean isFullHouse() {
    return isThreeOfAKind() && isPair();
  }

  public boolean isFourOfAKind() {
    Iterator<ArrayList<Card>> iter = cardCountPQ.iterator();
    while (iter.hasNext()) {
      if (iter.next().size() == 4) {
        return true;
      }
    }

    return false;
  }

  public boolean isStraightFlush() {
    return true;
  }

  public boolean isRoyalFlush() {
    return true;
  }

  @Override
  public String toString() {
    String handString = "-------------\n";

    for (Card card : hand) {
      handString += card.getSuit() + " - " +  card.getNum() + "\n";
    }

    handString += "-------------\n";

    return handString;
  }
}