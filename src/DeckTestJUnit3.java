import junit.framework.*;


public class DeckTestJUnit3 extends TestCase {
   private  Deck deck52, deck32, deck24 ,emptyDeck;

    protected void setUp() {
        deck52 = new Deck(52);
        deck32 = new Deck(32);
        deck24 = new Deck(24);
        emptyDeck = new Deck(7);
    }
    public void testShuffleDeck() throws Exception {
        Deck beforeShuffle = deck32;
        deck32.shuffleDeck();
        assertNotSame(beforeShuffle.toString(), deck32.toString());
    }

    public void testSortDeck() throws Exception {
        Card deuceHearts = new Card(Deck.Ranks.DEUCE, Deck.Suits.HEARTS);
        Card acePikes = new Card(Deck.Ranks.ACE, Deck.Suits.PIKES);
        deck52.sortDeck();
        deck24.sortDeck();

        assertEquals(deuceHearts.toString(), deck52.getCard(12).toString());
        assertEquals(acePikes.toString(), deck24.getCard(18).toString());

        int deck24Size = 24;
        deck24.sortDeck();
        assertEquals(deck24Size, deck24.cards.size());
    }

    public void testGetCard() throws Exception {
        assertNull(emptyDeck.getCard(5));
        assertNull(deck24.getCard(3245));
    }

}