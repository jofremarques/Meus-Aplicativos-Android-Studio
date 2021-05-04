package com.example.listadeitenssimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>();
        List<Curso> cursos = todosOsCursos();
        ListView ListaDeCursos = (ListView) findViewById(R.id.lista);
        ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>(this, android.R.layout.simple_list_item_1, cursos);
        ListaDeCursos.setAdapter(adapter);
    }
    private List<Curso> todosOsCursos(){
        return new ArrayList<>(Arrays.asList(
                new Curso("Java ","Básico de Java ",EstadoAtual.CONCLUIDO),
                new Curso("HTML & CSS ","HTML 5 e suas novidades ",EstadoAtual.EM_ANDAMENTO),
                new Curso("Android ","Boas práticas ",EstadoAtual.INSCRICOES_ABERTAS)
        ));
    }
}
