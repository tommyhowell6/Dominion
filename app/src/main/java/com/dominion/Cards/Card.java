package com.dominion.Cards;

import android.os.Parcel;
import android.os.Parcelable;

import com.dominion.Player;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class Card implements Parcelable {
    private String name;
    private int cost;

    public Card(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

    public String getName()
    {
        return name;
    }

    public int getCost()
    {
        return cost;
    }

    protected Card(Parcel in) {
        name = in.readString();
        cost = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(cost);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Card> CREATOR = new Parcelable.Creator<Card>() {
        @Override
        public Card createFromParcel(Parcel in) {
            return new Card(in);
        }

        @Override
        public Card[] newArray(int size) {
            return new Card[size];
        }
    };
}
