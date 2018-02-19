package com.dominion.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

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
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
//        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == RESULT_OK)
        {
            Toast.makeText(getApplicationContext(),data.getStringExtra("selectedDeck"), Toast.LENGTH_SHORT).show();
        }
    }
}
