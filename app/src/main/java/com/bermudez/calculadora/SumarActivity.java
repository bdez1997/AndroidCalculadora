package com.bermudez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SumarActivity extends AppCompatActivity {
    ImageButton btnCalcularSuma;
    EditText numberSuma,numberSuma2;
    TextView txtResultadoSuma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        setTitle("Sumar");
        btnCalcularSuma=findViewById(R.id.btnCalcularSuma);
        numberSuma=findViewById(R.id.editTextNumberSuma);
        numberSuma2=findViewById(R.id.editTextNumberSuma2);
        txtResultadoSuma=findViewById(R.id.txtResultadoRestar);

        btnCalcularSuma.setOnClickListener(e->{
        if(numberSuma.getText().toString().isEmpty()||numberSuma2.getText().toString().isEmpty()){
            Toast.makeText(this, "Debes introducir un número en cada campo", Toast.LENGTH_SHORT).show();
        }else{
            txtResultadoSuma.setText(""+sumar());
        }

        });

    }
    public double sumar() {
        double num1,num2,iSuma;

        num1=Double.parseDouble(numberSuma.getText().toString());
        num2=Double.parseDouble(numberSuma2.getText().toString());
        iSuma=num1+num2;
        return iSuma;
    }

}