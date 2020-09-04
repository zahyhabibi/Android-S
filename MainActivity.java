package com.example.list_view;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        list.add("eRePeeL");
        list.add("Erupeel");
        list.add("Erpeler");
        list.add("Repeel");
        list.add("Rekaya perangkat labil");
        list.add("aku gak bisa java :(  ");

    }
}
