package com.example.modu2_kelxx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.modu2_kelxx.R;

public class AboutActivity extends AppCompatActivity {

    String[]values = new String[]
            {       "Muhammad Dzulfiqar Rafli Anwar\n 21120119130065",
                    "Fiki Rilo Pambudi \n 21120119120001",
                    "Helmy Zakiudin \n 21120119130040",
                    "Akmal Irfan Maulana \n 21120119130109",
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayAdapter adapter =  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1,values);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

}
