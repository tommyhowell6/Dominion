package com.dominion.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.dominion.Adapters.CardAdapter;
import com.dominion.Decks.Deck;
import com.dominion.Decks.GameDeck;
import com.dominion.R;

/**
 * Created by tommyhowell on 1/30/18.
 */

public class DeckSelectionActivity extends AppCompatActivity
{
    private static final int NUMBER_OF_PLAYABLE_CARDS = 12;
    private Button selectedDeckButton;
    private Button startGameButton;
    private GridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_selection);
        Intent intent = getIntent();
        final int numberOfPlayers = (int) intent.getSerializableExtra("numberOfPlayers");

        Deck selectedDeck = new GameDeck(NUMBER_OF_PLAYABLE_CARDS);

        gridView = (GridView) findViewById(R.id.card_grid_view);
        gridView.setAdapter(new CardAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                Toast.makeText(DeckSelectionActivity.this, "" + i, Toast.LENGTH_SHORT).show();
            }
        });

        selectedDeckButton = (Button) findViewById(R.id.selected_deck_button);
        selectedDeckButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });

        startGameButton = (Button) findViewById(R.id.start_game_button_from_deck_select);
        startGameButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getBaseContext(), "Starting Game " + numberOfPlayers, Toast.LENGTH_SHORT).show();
            }
        });
        Intent backIntent = new Intent();
//        backIntent.putExtra("selectedDeck", selectedDeck);
        setResult(RESULT_OK, backIntent);
    }
}
