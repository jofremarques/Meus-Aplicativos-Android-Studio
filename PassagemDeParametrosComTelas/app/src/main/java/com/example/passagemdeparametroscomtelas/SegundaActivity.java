package com.example.passagemdeparametroscomtelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra(nome:"ParametroNome");


        TextView texto = (TextView) findViewById(R.id.txtRecepcao);
        texto.setText("Prezado(a)"+nome+,"Seja bem vindo(a) ao APP");

        }
    }


    package com.example.passagemdeparametros;
            import androidx.appcompat.app.AppCompatActivity;
            import android.content.Intent;
            import android.os.Bundle;
            import android.widget.TextView;
public class SegundaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("ParametroNome");

        TextView texto = (TextView) findViewById(R.id.txtRecepcao);
        texto.setText("Prezado(a) "+nome+", seja vem vindo ao App. ");
    }
}
