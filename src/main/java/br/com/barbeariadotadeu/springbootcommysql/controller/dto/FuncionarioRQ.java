package br.com.barbeariadotadeu.springbootcommysql.controller.dto;

import br.com.barbeariadotadeu.springbootcommysql.model.Pessoa;

public class FuncionarioRQ {
    private int tempoExp;
    private Pessoa pessoa;

    public int getTempoExp() {
        return tempoExp;
    }

    public void setTempoExp(int tempoExp) {
        this.tempoExp = tempoExp;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
