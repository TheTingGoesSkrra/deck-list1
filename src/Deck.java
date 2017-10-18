import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Deck {
    enum Ranks {ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, DEUCE}
    enum Suits {HEARTS, CLUBS, CLOVERS, PIKES}

    ArrayList<Card> cards;


    Deck(int numOfCards) {
        cards = new ArrayList<>();
        if(numOfCards == 24 || numOfCards == 32 || numOfCards == 52) {
            int cardNumber = 0;
            for (Ranks r: Ranks.values()) {
                for(Suits s: Suits.values()) {
                    if(cardNumber < numOfCards) {
                        cards.add(new Card(r, s));
                        cardNumber++;
                    }
                }
            }
        }
    }


    void shuffleDeck() {
        int randomNum;
        Random rnd = new Random();
        for(int i = 0; i < cards.size() - 1; i++) {
            randomNum = rnd.nextInt(cards.size());
            Collections.swap(cards, i, randomNum);
        }
    }

    void sortDeck() {
        Collections.sort(cards);
    }

    Card getCard(int index) {
        if (0 < index && index < cards.size()) {
            return cards.get(index);
        } else return null;
    }

    @Override
    public String toString() {
        String deckString = "";
        for(Card c: cards) {
            deckString += c.toString() + " ";
        }
        return deckString;
    }
}
