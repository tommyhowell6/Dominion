package com.dominion.Decks;

import android.os.Parcel;
import android.os.Parcelable;

import com.dominion.Cards.Card;

import java.util.ArrayList;

/**
 * Created by tommyhowell on 1/28/18.
 */

public class Deck implements Parcelable
{
    public Deck()
    {
    }

    ArrayList<Card> cards;

    protected Deck(Parcel in) {
        if (in.readByte() == 0x01) {
            cards = new ArrayList<Card>();
            in.readList(cards, Card.class.getClassLoader());
        } else {
            cards = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (cards == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(cards);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Deck> CREATOR = new Parcelable.Creator<Deck>() {
        @Override
        public Deck createFromParcel(Parcel in) {
            return new Deck(in);
        }

        @Override
        public Deck[] newArray(int size) {
            return new Deck[size];
        }
    };
}
