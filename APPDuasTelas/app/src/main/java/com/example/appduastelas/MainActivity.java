package com.example.appduastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irparatela2(View view) {
        Intent intent1 = new Intent(getApplicationContext(),Tela2.class);
        startActivity(intent1);
    }

    public void voltarTelaPrincipal(View view) {
    }
}