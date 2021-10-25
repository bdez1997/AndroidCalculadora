package com.bermudez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MultiplicarActivity extends AppCompatActivity {
    ImageButton btnMultiplicacion;
    EditText txtNumberMultiplicar,txtNumberMultiplicar2;
    TextView txtMultiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        setTitle("Multiplicar");
        btnMultiplicacion=findViewById(R.id.butnMultiplicacion);
        txtNumberMultiplicar=findViewById(R.id.edittxtMultiplicar);
        txtNumberMultiplicar2=findViewById(R.id.editTxtMultiplicar2);
        txtMultiplicacion=findViewById(R.id.txtResMultiplicacion);

        btnMultiplicacion.setOnClickListener(e->{
            if(txtNumberMultiplicar.getText().toString().isEmpty()||txtNumberMultiplicar.getText().toString().isEmpty()){
                Toast.makeText(this, "Debes introducir un número en cada campo", Toast.LENGTH_SHORT).show();
            }else{
                txtMultiplicacion.setText(""+multiplicar());
            }
        });
    }
    public double multiplicar(){
        double doNum1,doNum2,doMultiplicacion;
        doNum1=Double.parseDouble(txtNumberMultiplicar.getText().toString());
        doNum2=Double.parseDouble(txtNumberMultiplicar2.getText().toString());

        doMultiplicacion=doNum1*doNum2;
        return doMultiplicacion;

    }
}