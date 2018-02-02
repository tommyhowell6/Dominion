package com.dominion.Cards.TreasureCards;

import com.dominion.Cards.Card;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class TreasureCard extends Card
{
    public TreasureCard(String name, int cost, int value)
    {
        super(name, cost);
        this.value = value;
    }

    private int value;
}
