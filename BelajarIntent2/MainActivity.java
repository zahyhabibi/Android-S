package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        Button explicitintent;
        Button implicitintent;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        explicitintent = (Button)findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);

        implicitintent = (Button)findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitintent:
                Intent explicit = new Intent (MainActivity.this,IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.w3school.com"));
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}
