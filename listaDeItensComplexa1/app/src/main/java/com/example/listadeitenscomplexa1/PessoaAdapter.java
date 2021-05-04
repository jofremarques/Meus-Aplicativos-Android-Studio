package com.example.listadeitenscomplexa1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PessoaAdapter extends ArrayAdapter<Pessoa> {
    private final Context context;
    private final ArrayList<Pessoa> elementos;

    public PessoaAdapter(Context context, ArrayList<Pessoa> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);
        TextView nomePessoa =(TextView) rowView.findViewById(R.id.nome);
        ImageView image=( ImageView) rowView.findViewById(R.id.imagem);

        nomePessoa.setText(elementos.get(position).getNome());
        image.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }

}
