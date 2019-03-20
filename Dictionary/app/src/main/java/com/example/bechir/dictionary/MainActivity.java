package com.example.bechir.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] notions = new String[]{
            "SCRUM", "AGILE", "ISO 9001", "PMBOK", "ISO 27001", "ISO 45001",
            "Recette", "AMDEC"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView maListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, notions);
        maListView.setAdapter(adapter);
    }
}
