package com.example.intent_explicit_dengan_parcelable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_move_with_object);
        tvObject =(TextView)findViewById(R.id.object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name :"+mPerson.getName()
                +", Email :"+ mPerson.getEmail()
                + ", age :" + mPerson.getAge()
                +", lokasi" + mPerson.getCity();
                    tvObject.setText(text);
    }
}
