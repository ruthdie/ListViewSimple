package com.example.android.listviewsimple;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayAdapter<String> adapter;

    String[] myArray = {"Cupcake","Donat","Eclair","Froyo","Gingerbread","Honeycomb",
    "Ice Cream Sandwich","Jelly Bean","Kitkat","Lollipop"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.myListView);

        adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,myArray);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected",Toast.LENGTH_SHORT).show();
            }
        });




    }
}
