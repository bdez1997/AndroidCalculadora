package com.bermudez.calculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DividirActivity extends AppCompatActivity {
    EditText NumberDividir,NumberDividir2;
    TextView txtResultadoDividir;
    Button btnDividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        btnDividir =findViewById(R.id.btnDividir);
        NumberDividir=findViewById(R.id.editTxtDividir);
        NumberDividir2=findViewById(R.id.editTxtDividir2);
        txtResultadoDividir=findViewById(R.id.txtResultadoDividir);

        btnDividir.setOnClickListener(e->{
            txtResultadoDividir.setText(""+Dividir());
        });

    }
    public double Dividir(){
        Double dNume,dNume2,dDivision;

        dNume=Double.parseDouble(NumberDividir.getText().toString());
        dNume2=Double.parseDouble(NumberDividir2.getText().toString());
        dDivision=(dNume/dNume2);

        return dDivision;
    }
}