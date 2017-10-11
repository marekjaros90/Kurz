
import java.util.*;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand = new ArrayList<Card>();

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int compareTo(Hand compare) {
        int h1 = 0;
        for (Card card : this.hand) {
            h1 += card.getValue();
        }
        
        int h2 = 0;
        for (Card card2 : compare.hand) {
            h2 += card2.getValue();
        }
        return h1 - h2;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}
