package com.bermudez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSumar,btnRestar,btnMultiplicar,btnDividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);

        btnSumar.setOnClickListener(e->{
            Intent ventanaSumar = new Intent(this, SumarActivity.class);
            startActivity(ventanaSumar);
        });

        btnRestar.setOnClickListener(e->{
            Intent ventanaRestar = new Intent(this, RestarActivity.class);
            startActivity(ventanaRestar);
        });

        btnMultiplicar.setOnClickListener(e->{
            Intent ventanaMultiplicar=new Intent(this,MultiplicarActivity.class);
            startActivity(ventanaMultiplicar);
        });

    }
}