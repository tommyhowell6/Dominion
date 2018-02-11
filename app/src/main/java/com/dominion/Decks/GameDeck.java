package com.dominion.Decks;

import com.dominion.Cards.Card;
import com.dominion.Exceptions.OutOfCards;

import java.util.ArrayList;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class GameDeck extends Deck
{
    private String name;

    public GameDeck(Card card)
    {
        this.name = card.getName();
        cards = new ArrayList<>();
    }

    public Card purchaseCard() throws OutOfCards
    {
        if(cards.size() > 0)
        {
            return cards.get(0);
        }
        else
        {
            throw new OutOfCards("No cards left in the " + name + " Deck");
        }
    }

}
