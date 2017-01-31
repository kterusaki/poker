import java.util.*;

public class Player {

  private String name;
  private ArrayList<Card> hand;
  private int chips;

  public Player(String name) {
    this.name = name;
    this.chips = 0;
    this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return name;
  }

  public void setHand(Collection<Card> hand) {
    this.hand = (ArrayList<Card>)hand;
  }

  public ArrayList<Card> getHand() {
    return hand;
  }

  public void addChips(int amount) {
    chips += amount;
  }

  public void subtractChips(int amount) throws Exception {
    if (this.chips - amount < 0) {
      throw new Exception("Invalid Balance: balance can not be negative");
    }

    this.chips -= amount;
  }

  public int getChips() {
    return chips;
  }
}
