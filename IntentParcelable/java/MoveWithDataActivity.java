package com.example.intent_explicit_dengan_parcelable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import  android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    public static String EXTRA_AGE ="extra age";
    public static String EXTRA_NAME="extra name";
    private  TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataReceived = (TextView)findViewById(R.id.tv_data_received);
        String name= getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,0);
        String text="Name : " +name+",Your age : " +age;
        tvDataReceived.setText(text);
    }
}
