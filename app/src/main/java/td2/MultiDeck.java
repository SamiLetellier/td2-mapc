package td2;

import java.util.ArrayList;
import java.util.List;

public class MultiDeck {
    private List<Deck> decks;

    public MultiDeck(int nbrDecks) {
        assert nbrDecks > 0;
        decks = new ArrayList<>();
        for (int i = 0; i < nbrDecks; i++) {
            decks.add(new Deck());
        }
    }

    public MultiDeck(MultiDeck multiDeck) {
        this.decks = new ArrayList<>();
        for (Deck deck : multiDeck.decks) {

        }
    }

    public Card draw() {
        assert size() > 0;
        return decks.stream().filter(d -> d.size() > 0).findFirst().get().draw();
    }

    public int size() {
        return decks.stream().mapToInt(Deck::size).sum();
    }

    public List<Card> cards() {
        return decks.stream().flatMap(deck -> deck.cards.stream()).toList();
    }

    @Override
    public String toString() {
        return "MultiDeck{" +
                "with" + size() + "cards" +
                '}';
    }

}
