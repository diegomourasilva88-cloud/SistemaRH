package model;

import java.lang.invoke.StringConcatException;

public class Endereço {

    String estado;
    String cidade;
    String cep;


    public Endereço (String estado, String cidade, String cep) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;



    } public String getEstado(){
        return estado;
    }
    public  String getCidade(){
        return  cidade;

    }public String getCep(){
        return cep;
    }
}
