package com.example.navegar_em_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nota1;
    private EditText nota2;
    private Button btnCalcular;
    private TextView mediaFinal;
    private Button btnTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1 = ( EditText ) findViewById(R.id.txtNota1);
        nota2 = ( EditText ) findViewById(R.id.txtNota2);
        btnCalcular = ( Button ) findViewById(R.id.btnCalcular);
        btnTela2 = ( Button ) findViewById(R.id.btnTela2);
        mediaFinal = ( TextView ) findViewById(R.id.txtMediaFinal);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Double n1 = Double.valueOf(nota1.getText().toString());
                Double n2 = Double.valueOf(nota2.getText().toString());
                Double media = (n1 + n2) /2;
                mediaFinal.setText(media.toString());
            }
        });
        btnTela2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),segundaTela.class);
                startActivity(intent1);
            }

        });
    }

   /* public void irparatela2 (View view) {

        Intent intent1 = new Intent(getApplicationContext(),Tela2.class);
        startActivity(intent1);
    }
    */
}