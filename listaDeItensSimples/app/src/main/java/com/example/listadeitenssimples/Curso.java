package com.example.listadeitenssimples;

public class Curso {
    private String nome;
    private String descricao;
    private EstadoAtual estado;

    public Curso(String nome, String descricao, EstadoAtual estado){
        this.nome = nome;
        this.descricao = descricao;
        this. estado = estado;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome=nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(){
        this.descricao = descricao;
    }
    public EstadoAtual getEstado(){
        return estado;
    }
    public void setEstado(){
        this.estado = estado;
    }
    @Override
    public String toString(){
        return "Curso: "+ nome+ " Descrição: " + descricao + " Estado: " + estado;
    }

}
