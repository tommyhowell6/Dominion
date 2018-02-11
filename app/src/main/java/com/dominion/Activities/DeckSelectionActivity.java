package com.dominion.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.dominion.Adapters.CardAdapter;
import com.dominion.R;

/**
 * Created by tommyhowell on 1/30/18.
 */

public class DeckSelectionActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_selection);

        GridView gridView = (GridView) findViewById(R.id.card_grid_view);
        gridView.setAdapter(new CardAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                Toast.makeText(DeckSelectionActivity.this, "" + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
