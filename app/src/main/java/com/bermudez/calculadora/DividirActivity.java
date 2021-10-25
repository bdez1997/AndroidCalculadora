package com.bermudez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DividirActivity extends AppCompatActivity {
    ImageButton btnDivision;
    EditText txtNumberDivision,txtNumberDivision2;
    TextView txtResDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        setTitle("Dividir");
        btnDivision =findViewById(R.id.btnDivision);
        txtNumberDivision=findViewById(R.id.editTxtNumberDividir);
        txtNumberDivision2=findViewById(R.id.editTxtDividir2);
        txtResDivision=findViewById(R.id.txtResDividir);

           btnDivision.setOnClickListener(e->{
               txtResDivision.setText(""+dividir());
           });
    }
    public double dividir(){
        double doNumero,doNumero1,doDivision;

        doNumero=Double.parseDouble(txtNumberDivision.getText().toString());
        doNumero1=Double.parseDouble(txtNumberDivision2.getText().toString());

        doDivision=doNumero/doNumero1;
        return doDivision;

    }
}