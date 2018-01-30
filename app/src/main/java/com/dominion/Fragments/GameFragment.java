package com.dominion.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.dominion.R;

/**
 * Created by tommyhowell on 1/29/18.
 */

public class GameFragment extends Fragment
{
    private Button mStartGameButton;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState)
    {
        final View v = inflater.inflate(R.layout.game_fragment, container, false);

        mStartGameButton = (Button) v.findViewById(R.id.start_game_button);
        mStartGameButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(container.getContext(), "Start Game", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}
