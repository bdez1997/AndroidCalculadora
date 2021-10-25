package com.bermudez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumarActivity extends AppCompatActivity {
    Button btnCalcularSuma;
    EditText numberSuma,numberSuma2;
    TextView txtResultadoSuma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
        setTitle("Sumar");
        btnCalcularSuma=findViewById(R.id.btnCalcularSuma);
        numberSuma=findViewById(R.id.editTextNumberSumar);
        numberSuma2=findViewById(R.id.editTextNumberSumar2);
        txtResultadoSuma=findViewById(R.id.txtResultadoSuma);
        btnCalcularSuma.setOnClickListener(e->{
            txtResultadoSuma.setText(""+sumar());
        });
        if(numberSuma.getText()==null||numberSuma2.getText()==null){
            Toast.makeText(this,"Introduce algo",Toast.LENGTH_LONG).show();
        }

    }
    public int sumar() {
        int num1,num2,iSuma;

        num1=Integer.parseInt(numberSuma.getText().toString());
        num2=Integer.parseInt(numberSuma2.getText().toString());
        iSuma=num1+num2;
        return iSuma;
    }

}