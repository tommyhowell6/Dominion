package com.dominion.Cards.Abilities;

import com.dominion.Player;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class DrawCard extends Ability
{

    @Override
    void callAbility(Player player)
    {
        player.drawCard();
    }
}
