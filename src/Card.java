class Card implements Comparable<Card> {
    private Deck.Suits suit;
    private Deck.Ranks rank;

    @Override
    public int compareTo(Card card) {
        if(this.suit != card.suit) {
            return this.suit.compareTo(card.suit);
        } else {
            return this.rank.compareTo(card.rank);
        }
    }
    @Override
    public String toString() {
        return (rank.toString() + " of " + suit.toString());
    }

    Card (Deck.Ranks rank, Deck.Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
