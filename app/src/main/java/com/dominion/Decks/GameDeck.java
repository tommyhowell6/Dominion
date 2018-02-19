package com.dominion.Decks;

import com.dominion.Cards.Card;
import com.dominion.Exceptions.GameDeckFull;
import com.dominion.Exceptions.OutOfCards;

import java.util.ArrayList;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class GameDeck extends Deck
{
    private int numberOfDecks;
    private String name;


    public GameDeck(int numberOfDecks)
    {
        this.numberOfDecks = numberOfDecks;
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

    public boolean toggleCardToGameDeck(Card card) throws GameDeckFull
    {
        if(cards.contains(card))
        {
            cards.remove(card);
            return false;
        }
        else if(numberOfDecks >= cards.size())
        {
            throw new GameDeckFull("You have already selected " + numberOfDecks + " cards");
        }
        else
        {
            cards.add(card);
            return true;
        }
    }
}
