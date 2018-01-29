package com.dominion.Phases;

/**
 * Created by tommyhowell on 1/29/18.
 */

public class PlayPhase extends Phase
{
    public PlayPhase()
    {
        moneyMade = 0;
        numberOfBuys = 1;
        numberRemainingActions = 1;
    }

    private int moneyMade;
    private int numberRemainingActions;
    private int numberOfBuys;

    public void addAction()
    {
        numberRemainingActions++;
    }

    public void useAction()
    {
        numberRemainingActions--;
    }

    public void addBuy()
    {
        numberOfBuys++;
    }

    public void addMoney()
    {
        moneyMade++;
    }

    public void endPhase()
    {
        super.endPhase(new BuyPhase());
    }
}
