package com.example.passagemdeparametroscomtelas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText n = (EditText) findViewById(R.id.txtNome);
        Button ok = (Button) findViewById(R.id.btnTela1);
        ok.setOnClickListener  ((View view ) {
                Intent intent = new Intent(packageContext: MainActivity.this, SegundaActivity.class);
                intent.putExtra(name: "ParametroNome", n.getText().toString());
                startActivity(intent);
        })
        }
    }



    package com.example.passagemdeparametros;

            import androidx.appcompat.app.AppCompatActivity;

            import android.content.Intent;
            import android.os.Bundle;
            import android.view.View;
            import android.widget.Button;
            import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText n = (EditText) findViewById(R.id.txtNome);
        Button ok = (Button) findViewById(R.id.btnTela1);
        ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("ParametroNome", n.getText().toString());
                startActivity(intent);
            }
        });
    }
}