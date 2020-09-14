package com.example.customlistview;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
public class MyListAdapter extends ArrayAdapter<Hero> {

    List <Hero> heroList;

    Context context;

    int resource;

    public MyListAdapter(Context context, int resource, List<Hero> heroList){
        super(context,resource,heroList);
            this.context = context;
            this.resource = resource;
            this.heroList = heroList;
    }
    @NonNull

    public View getView (final int position, @Nullable View convertView, @NonNull ViewGroup parent){
        //ini komen
        //ini komen
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //masih komen

        View view = layoutInflater.inflate(resource,null,false);
        //masih

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewTeam = view.findViewById(R.id.textViewTeam);
        Button buttonDelete = view.findViewById(R.id.buttonDelete);
        //still komen

        Hero hero = heroList.get(position);

        //masih '-'

        imageView.setImageDrawable(context.getResources(). getDrawable(hero.getImage
                ()));
        textViewName.setText(hero.getName());
        textViewName.setText(hero.getTeam());

        // komen
        buttonDelete.setOnClickListener(new View.OnClickListener () {
            @Override
            public  void  onClick(View view){
                //NGOMENT
                //KOMENT
                removeHero(position);
            }
        });
        //KOMENT
        return  view;
    }
    private void removeHero(final int position){
        //kome
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Apakah anda yakin ingin menghapus  ini???");

        // komen
        builder.setPositiveButton("Iya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                // hapus salah satu item
                heroList.remove(position);
                // reload list
                notifyDataSetChanged();
            }
        });
        // kome tambah n :)
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                //kosong :v
            }
        });

        //askelerasi dan display alert dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
