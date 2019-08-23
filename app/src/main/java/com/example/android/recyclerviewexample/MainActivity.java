package com.example.android.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity";

    private ArrayList<String> mVideoTitles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "onCreate: started.");

        titleList();

    }

    private void titleList() {
        mVideoTitles.add("Official Trailer");
        mVideoTitles.add("Official New Trailer");
        mVideoTitles.add("John Wick: Chapter 3 - Parabellum (2019) Clip “Director Conversation” - Keanu Reeves");
        mVideoTitles.add("John Wick: Chapter 3 – Parabellum (2019 Movie) Official TV Spot “Guns” – Keanu Reeves, Halle Berry");
        mVideoTitles.add("John Wick: Chapter 3 – Parabellum (2019 Movie) Official TV Spot “Bounty” – Keanu Reeves, Halle Berry");
        mVideoTitles.add("John Wick: Chapter 3 - Parabellum (2019) Official TV Spot “Watching” - Keanu Reeves, Halle Berry");
        mVideoTitles.add("John Wick: Chapter 3 - Parabellum (2019 Movie) Official Clip “Taxi” – Keanu Reeves, Halle Berry");
        mVideoTitles.add("John Wick: Chapter 3 - Parabellum (2019) Official Clip “Management” – Keanu Reeves, Halle Berry");
        mVideoTitles.add("John Wick: Chapter 3 - Parabellum (2019) Official Behind the Scenes “Art of Action” – Keanu Reeves");
        mVideoTitles.add("John Wick: Chapter 3 - Parabellum (2019 Movie) “Happy National Puppy Day” - Keanu Reeves");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mVideoTitles);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
