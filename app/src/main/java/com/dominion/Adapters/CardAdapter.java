package com.dominion.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.dominion.Cards.Card;
import com.dominion.Cards.VictoryCards.VictoryCard;
import com.dominion.R;

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
        return 9;
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
        if(i < 9)
        {
            imageView.setImageResource(getCoinResouse(i));
        }
        return imageView;
    }

    private Card[] allCards = {new VictoryCard("Estate", 8, 5)};
    private int getCoinResouse(int i)
    {
        switch (i)
        {
            case 0:
                return R.drawable.coin_0;
            case 1:
                return R.drawable.coin_1;
            case 2:
                return R.drawable.coin_2;
            case 3:
                return R.drawable.coin_3;
            case 4:
                return R.drawable.coin_4;
            case 5:
                return R.drawable.coin_5;
            case 6:
                return R.drawable.coin_6;
            case 7:
                return R.drawable.coin_7;
            case 8:
                return R.drawable.coin_8;
        }
        return 0;// **TO DO** 2/8/18  make a container to avoid getting 0 for any error
    }
}
