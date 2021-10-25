package com.bermudez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RestarActivity extends AppCompatActivity {
    EditText NumberResta,NumberResta2;
    TextView txtResultadoResta;
    ImageButton btnRestaOp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);
        setTitle("Restar");
        btnRestaOp =findViewById(R.id.btnRestaOp);
        NumberResta=findViewById(R.id.editTxtRestar);
        NumberResta2=findViewById(R.id.editTxtRestar2);
        txtResultadoResta=findViewById(R.id.txtResultadoRestar);

        btnRestaOp.setOnClickListener(e->{
            txtResultadoResta.setText(""+Restar());
        });

    }
    public double Restar(){
        Double dNum,dNum2,dResta;

        dNum=Double.parseDouble(NumberResta.getText().toString());
        dNum2=Double.parseDouble(NumberResta2.getText().toString());
        dResta=dNum-dNum2;

        return dResta;
    }
}