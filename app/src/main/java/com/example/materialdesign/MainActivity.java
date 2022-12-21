package com.example.materialdesign;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24, "Very happy", "Life is fun!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24, "Happy", "Life is good!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_dissatisfied_24, "Sad", "Maybe life is not that good."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24, "Very sad", "Life is sad."));

    }
}