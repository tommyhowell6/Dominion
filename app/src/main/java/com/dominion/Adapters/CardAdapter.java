package com.dominion.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.dominion.Cards.Card;
import com.dominion.Cards.VictoryCards.VictoryCard;

import java.util.ArrayList;

/**
 * Created by tommyhowell on 1/31/18.
 */

public class CardAdapter extends BaseAdapter
{
    private Context mContext;

    public CardAdapter(Context c)
    {
        mContext = c;
    }

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
        ImageView imageView;
        if(view == null)
        {
            imageView = new ImageView(mContext);

        }
        else
        {
            imageView = (ImageView) view;
        }
        return imageView;
    }

    private Card[] allCards = {new VictoryCard("Estate", 8, 5)};
}
