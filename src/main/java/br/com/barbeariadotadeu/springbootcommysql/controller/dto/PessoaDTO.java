package br.com.barbeariadotadeu.springbootcommysql.controller.dto;

import br.com.barbeariadotadeu.springbootcommysql.model.Pessoa;

public class PessoaDTO {

    private int id;
    private String nome;
    private  int telefone;

    public static PessoaDTO converter(Pessoa p) {
        var pessoa = new PessoaDTO();
        pessoa.setId(p.getId());
        pessoa.setNome(p.getNome());
        pessoa.setTelefone(p.getTelefone());
        return pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
