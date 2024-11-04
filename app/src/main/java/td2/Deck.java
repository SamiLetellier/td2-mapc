package td2;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> cards = new ArrayList<>();

    public Deck() {

    }

    public int size() {
        return cards.size();
    }
    public Card draw() {
        return cards.remove(0);
    }

}
