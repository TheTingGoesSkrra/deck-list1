import org.junit.*;
import static  org.junit.Assert.*;

public class DeckTestJUnit4 {
    private Deck deck52, deck32, deck24, emptyDeck;

    @Before
    public void setUp() {
        deck52 = new Deck(52);
        deck32 = new Deck(32);
        deck24 = new Deck(24);
        emptyDeck = new Deck(7);
    }

    @Test(timeout = 100)
    public void shuffleDeck() throws Exception {
        Deck deckBeforeShuffle = deck52;
        deck52.shuffleDeck();
        assertEquals(deckBeforeShuffle, deck52);
    }

    @Test
    public void sortDeck() throws Exception {
        Card deuceHearts = new Card(Deck.Ranks.DEUCE, Deck.Suits.HEARTS);
        Card acePikes = new Card(Deck.Ranks.ACE, Deck.Suits.PIKES);
        deck52.sortDeck();
        deck24.sortDeck();

        assertEquals(deuceHearts.toString(), deck52.getCard(12).toString());
        assertEquals(acePikes.toString(), deck24.getCard(18).toString());
    }

    @Ignore
    @Test
    public void getCard() throws Exception {
        assertNull(emptyDeck.getCard(5));
        assertNull(deck24.getCard(3245));
    }

}