package com.dominion.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dominion.Fragments.GameFragment;
import com.dominion.R;

public class MainActivity extends AppCompatActivity implements myInterface
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_id);

        if (fragment == null)
        {
            fragment = new GameFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_id, fragment, "Fragment_Tag").commit();
        }
    }

    @Override
    public void startMyIntent(Intent i) {
        startActivity(i);
    }
}
