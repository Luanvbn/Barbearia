package br.com.barbeariadotadeu.springbootcommysql.controller.dto;

import br.com.barbeariadotadeu.springbootcommysql.model.Pessoa;

public class ClienteRQ {

    private String horaMarcada;
    private Pessoa pessoa;

    public String getHoraMarcada() {
        return horaMarcada;
    }

    public void setHoraMarcada(String horaMarcada) {
        this.horaMarcada = horaMarcada;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
