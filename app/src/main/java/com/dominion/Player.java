package com.dominion;

import com.dominion.Cards.Card;
import com.dominion.Decks.Hand;
import com.dominion.Decks.PlayerDeck;
import com.dominion.Exceptions.OutOfCards;
import com.dominion.Phases.Phase;

import java.util.ArrayList;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class Player
{
    private Phase phase;
    private PlayerDeck deck;
    private Hand hand;
    private ArrayList<Card> fieldOfPlay;
    private ArrayList<Card> discardPile;

    public void drawCard()
    {
        try
        {
            hand.add(deck.draw());
        }catch (OutOfCards e)
        {
            if(discardPile.size() != 0)
            {
                deck.reshuffle(discardPile);
            }
        }
    }
    public void playCard()
    {

    }
    public void discard()
    {

    }
}
