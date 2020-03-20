package com.example.sgoppenweilerstrmpfelbach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView_players);

        final ArrayList<String> myTeam = new ArrayList<>();
        myTeam.add("Paul Schmidel");
        myTeam.add("Malik Hassler");
        myTeam.add("Felix Kübler");
        myTeam.add("Benjamin Cshauth");
        myTeam.add("Manuel Perri");
        myTeam.add("Jonas Wieland(Zell)");
        myTeam.add("Jonas Wieland (Großerlach)");
        myTeam.add("Marcel Friz");
        myTeam.add("Nico Friz");
        myTeam.add("Even Stoppel");
        myTeam.add("Moritz Stoppel");
        myTeam.add("Luca Krämer");
        myTeam.add("Lukas Rosenke");
        myTeam.add("Stephen Perri");
        myTeam.add("JK");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myTeam);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*
                Intent intent = new Intent(MainActivity.this,MusicPlayer.class);
                startActivity(intent);

                 */
            }
        });

    }





}
