package com.dominion.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dominion.Cards.Card;
import com.dominion.Cards.VictoryCards.VictoryCard;

import java.util.ArrayList;

/**
 * Created by tommyhowell on 1/31/18.
 */

public class CardAdapter extends BaseAdapter
{
    @Override
    public int getCount()
    {
        return allCards.length;
    }

    @Override
    public Object getItem(int i)
    {
        return null;
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        return null;
    }

    private Card[] allCards = {new VictoryCard("Estate", 8, 5)};
}
