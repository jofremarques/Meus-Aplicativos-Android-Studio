package com.example.teladelogin_jofre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText senha;
    private Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.txtUsuario);
        senha = (EditText) findViewById(R.id.txtSenha);
        btnLogar = (Button) findViewById(R.id.btnLogar);

        btnLogar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String valorUsuario = usuario.getText().toString();
                String valorSenha = senha.getText().toString();

                if (valorUsuario.equals("Jofre") && valorSenha.equals("123")){

                    Intent intent1 = new Intent(getApplicationContext(), telaCliente.class);
                    intent1.putExtra("nome","Jhonnata Novaes Pires");
                    intent1.putExtra("matricula","201903330181");
                    intent1.putExtra("usuario",valorUsuario);

                    startActivity(intent1);
                } else {

                    alert("Login e/ou senha invalidos");

                }

            }

        });
    }
    private void alert (String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}