import java.util.*;

public class Notepad {

  public static void main(String args[]) {
//    HashMap<Card, Integer>  countHash = new HashMap<Card, Integer>();
//
//    try {
//      Card card = new Card("Diamonds", 1);
//      countHash.put(card, 1);
//
//      for (Card c : countHash.keySet()) {
//        System.out.println(c);
//      }
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//    HashMap<int, ArrayList<Card>> testMap = new HashMap<int, ArrayList<Card>>();
//
//    Deck deck = new Deck();
//    ArrayList<Card> hand = deck.dealCards(7);
//
//    for (Card c : hand) {
//      if (!testMap.containsKey(c.getNum())) {
//        testMap.put(c.getNum(), new ArrayList<Card>());
//      }
//
//      testMap.get(c.getNum()).add(c);
//    }
//
//    HashMap<int, ArrayList<Card>> newMap = new HashMap<int, ArrayList<Card>>();
//
//    for (Card c : hand) {
//      newMap.put(c.getNum(), testMap.get(c.getNum()));
//    }

    HashMap<Integer, ArrayList<Integer>> testMap = new HashMap<Integer, ArrayList<Integer>>();

    for (int i = 0; i < 5; i++) {
      if (!testMap.containsKey(i)) {
        testMap.put(i, new ArrayList<Integer>());
      }

      testMap.get(i).add(i);
    }

    ArrayList<Integer> testArray = testMap.get(0);
    testArray.add(0);

    System.out.println("testMap array size: " + testMap.get(0).size());
    System.out.println("testArray size: " + testArray.size());

    Integer arraySize = testArray.size();
    System.out.println("arraySize: " + arraySize);
    testArray.add(0);

    System.out.println("testMap array size: " + testMap.get(0).size());
    System.out.println("testArray size: " + testArray.size());
    System.out.println("arraySize: " + arraySize);



  }
}
