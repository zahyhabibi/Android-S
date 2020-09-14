package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private TextView hasil;
    private Button jumlahkan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }
        private void initUI(){
        bil1      =  (EditText)findViewById(R.id.txtbil1);
        bil2      =  (EditText)findViewById(R.id.txtbil2);
        hasil     =  (TextView) findViewById(R.id.txthasil);
        jumlahkan =  (Button)findViewById(R.id.jumlahkan);
        }
        private void hitungJumlah(){
        int angka1= Integer.parseInt(bil1.getText().toString());
        int angka2= Integer.parseInt(bil2.getText().toString());
        int total =angka1 + angka2;
        hasil.setText(total+"");
        }
        private void initEvent(){
            jumlahkan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hitungJumlah();
                }
            });
        }
}
