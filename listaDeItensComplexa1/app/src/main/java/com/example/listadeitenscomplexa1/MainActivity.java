package com.example.listadeitenscomplexa1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Associar a ListView com as pessoas da classse Pessoa
        ListView lista = (ListView) findViewById(R.id.IVPessoas);
        //Crias o ArrayAdapter e depois setar
        ArrayAdapter adapter = new PessoaAdapter(this, adicionarPessoas());
        lista.setAdapter(adapter);
    }
    private ArrayList<Pessoa> adicionarPessoas(){
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa p = new Pessoa("Mamute pequenino", R.drawable.mamute);
        pessoas.add(p);
        p = new Pessoa("Jofre Marques", R.drawable.jojozim);
        pessoas.add(p);
        return pessoas;
    }
}






