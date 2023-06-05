package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;
  
  private int rank;
  private int suit;
  private boolean faceUp;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
      this.rank = rank;
      this.suit = suit;
      this.faceUp = faceUp;
    //FIX THIS
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return faceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
      if (faceUp == true) {
          this.faceUp = faceUp;
      } else {
          this.faceUp = false;
      }
    //FIX THIS
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return rank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return suit;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
      if (ob == null || !(ob instanceof Card)) {
          return false;
      } else if (ob == this) {
          return true;
      } else {
          Card c =(Card) ob;
          return (c.rank == rank && c.suit == suit);
      } //FIX THIS
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
      if (rank == c.rank) {
          return suit - c.suit;
      } else {
          return rank - c.rank;
      }
    //FIX THIS
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      switch(rank) {
          case 2 -> {
              return "2";
          }
          case 3 -> {
              return "3";
          }
          case 4 -> {
              return "4";
          }
          case 5 -> {
              return "5";
          }
          case 6 -> {
              return "6";
          }
          case 7 -> {
              return "7";
          }
          case 8 -> {
              return "8";
          }
          case 9 -> {
              return "9";
          }
          case 10 -> {
              return "10";
          }
          case 11 -> {
              return "JACK";
          }
          case 12 -> {
              return "QUEEN";
          }
          case 13 -> {
              return "KING";
          }
          case 14 -> {
              return "ACE";
          }
          default -> {
              return "error";
          }
      }
    //FIX THIS
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
      switch(suit) {
          case CLUB -> {
              return "CLUB";
          }
          case DIAMOND -> {
              return "DIAMOND";
          }
          case HEART -> {
              return "HEART";
          }
          case SPADE -> {
              return "SPADE";
          }
          default -> {
              return "error";
          }
      }
    //FIX THIS
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
      if (faceUp == false) {
          return "?";
      } else {
          return getRankString() + " of " + getSuitString();
      }
    //FIX THIS
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: " + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: " + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: " + club5.equals(spadeAce));
    System.out.println("club5 equals club5: " + club5.equals(club5));
  }
}