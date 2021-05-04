package com.example.teladelogin_jofre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class telaCliente extends AppCompatActivity {
    private EditText edtNome ;
    private EditText edtMatricula;
    private Button btnTela1;
    private TextView textCabecalho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente);

        Intent intent = getIntent();
        String nomeIntent = intent.getSerializableExtra("nome").toString();
        String matriculaIntent = intent.getSerializableExtra("matricula").toString();
        String usuarioIntent = intent.getSerializableExtra("usuario").toString();

        textCabecalho = ( TextView ) findViewById(R.id.textCabecalho);
        textCabecalho.setText("Usuario(a) " + usuarioIntent + ", seja Bem Vindo ao formulario");

        btnTela1 = ( Button ) findViewById(R.id.btnTela1);
        edtNome = ( EditText ) findViewById(R.id.txtNome);

        edtNome.setText(nomeIntent);



        edtMatricula = ( EditText ) findViewById(R.id.txtMatricula);

        edtMatricula.setText(matriculaIntent);

        btnTela1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }

        });
    }

}