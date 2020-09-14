package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // List dari hero untuk menahan item Listnya
        List<Hero> heroList;
    // List Viewnya
        ListView listView;


    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi objek
            heroList = new ArrayList<>();
            listView = (ListView)findViewById(R.id.listView);
        //menambahkan sebuah value untuk list kita

            heroList.add(new Hero(R.drawable.joker, "Joker", "Justice gang"));
            heroList.add(new Hero(R.drawable.batman, "Batman", "Justice gang"));
        heroList.add(new Hero(R.drawable.captainamerica, "Kapten amerika", "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Dokter aneh :v", "Avengers"));
        heroList.add(new Hero(R.drawable.spiderman,"Spiderman","Avengers"));
        heroList.add(new Hero(R.drawable.ironman,"Mang Oleh","Avengers"));

        //membuat adapternya
            MyListAdapter adapter = new MyListAdapter(this,R.layout.my_custom_list,heroList);
        //attaching adapter ke listView
            listView.setAdapter(adapter);

}
}
