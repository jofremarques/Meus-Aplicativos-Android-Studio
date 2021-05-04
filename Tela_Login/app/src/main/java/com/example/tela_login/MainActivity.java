package com.example.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btnLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView) findViewById(R.id.txtLogin);
                TextView tSenha = (TextView) findViewById(R.id.txtSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if (login.equals("jofre") && senha.equals("123")) {
                    alert("O login foi realizado com sucesso");
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