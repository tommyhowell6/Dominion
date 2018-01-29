package com.dominion.Decks;

import com.dominion.Cards.Card;
import com.dominion.Exceptions.OutOfCards;

import java.util.ArrayList;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class PlayerDeck extends Deck
{
    public Card draw() throws OutOfCards
    {
        if(cards.size() == 0)
        {
            throw new OutOfCards("You have no cards in your deck");
        }
        return cards.get(0);
    }

    public void reshuffle(ArrayList<Card> discardPile)
    {
        cards.addAll(discardPile);
    }
}
