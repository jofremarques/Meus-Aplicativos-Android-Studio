package com.example.media_app;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1 = ( EditText ) findViewById(R.id.txtNota1);
        nota2 = ( EditText ) findViewById(R.id.txtNota2);
        btnCalcular = ( Button ) findViewById(R.id.btnCalcular);
        mediaFinal = ( TextView ) findViewById(R.id.txtMediaFinal);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double n1 = Double.valueOf(nota1.getText().toString());
                Double n2 = Double.valueOf(nota2.getText().toString());
                Double media = (n1 + n2) /2;
                mediaFinal.setText(media.toString());
            }
        });

    }
}