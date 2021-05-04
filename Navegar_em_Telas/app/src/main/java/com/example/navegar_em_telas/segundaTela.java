package com.example.navegar_em_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segundaTela extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button btnCalcular;
    private TextView valorFinal;
    private Button btnTela1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        btnTela1 = ( Button ) findViewById(R.id.btnTela1);
        num1 = ( EditText ) findViewById(R.id.txtNum1);
        num2 = ( EditText ) findViewById(R.id.txtNum2);
        btnCalcular = ( Button ) findViewById(R.id.btnCalcular);
        valorFinal = ( TextView ) findViewById(R.id.txtValorFinal);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double n1 = Double.valueOf(num1.getText().toString());
                Double n2 = Double.valueOf(num2.getText().toString());
                Double soma = (n1 + n2);
                valorFinal.setText(soma.toString());
            }
        });


        btnTela1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }

        });
    }

}