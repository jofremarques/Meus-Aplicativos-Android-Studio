package com.example.listadeitenssimples;

public enum EstadoAtual {
    EM_ANDAMENTO{
        @Override
        public String toString(){
            return "EM_ANDAMENTO";
        }
    },CONCLUIDO{
        @Override
        public String toString(){
            return "CONCLUIDO";
        }
    }, INSCRICOES_ABERTAS{
        @Override
        public String toString(){
            return "INSCRICOES_ABERTAS";
        }
    }
}
