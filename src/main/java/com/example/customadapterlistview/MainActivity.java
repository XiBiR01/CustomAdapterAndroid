package com.example.customadapterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] shapeList ={"Rectangle", "Square" ,"Circle","Triangle"};
    int[] images ={R.drawable.rectangle,R.drawable.square,R.drawable.circle,R.drawable.triangle};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ListView listView = findViewById(R.id.myListView);
//        Check CustomAdapter.java for Implementations of this Constructor
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),shapeList,images);
//        Setting the customAdapter object to the ListView
        listView.setAdapter(customAdapter);


    }
}