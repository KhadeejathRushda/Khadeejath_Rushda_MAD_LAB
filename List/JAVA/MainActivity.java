package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String fruitlist []={"Cherry","Kiwi","Pineapple","Strawberry"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.activity_main2,R.id.textview,fruitlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("ListView", "Item is clicked @position" + position);
                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, cherry.class));
                } else if (position == 1) {
                    startActivity(new Intent(MainActivity.this, kiwi.class));
                } else if (position == 2) {
                    startActivity(new Intent(MainActivity.this, pineapple.class));
                } else if (position == 3) {
                    startActivity(new Intent(MainActivity.this, strawberry.class));
                }
            }
            });
    }
}
