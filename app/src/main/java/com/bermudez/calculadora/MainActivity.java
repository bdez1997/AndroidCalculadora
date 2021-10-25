package com.bermudez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSumar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar = (Button) findViewById(R.id.btnSumar);

        btnSumar.setOnClickListener(e->{
            Intent ventanaSumar = new Intent(this, SumarActivity.class);
            startActivity(ventanaSumar);
        });


    }
}