package com.dominion.Cards.VictoryCards;

import com.dominion.Cards.Card;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class VictoryCard extends Card
{
    public VictoryCard(String name, int cost, int victoryPointValue)
    {
        super(name, cost);
        this.victoryPointValue = victoryPointValue;
    }

    private int victoryPointValue;
}
