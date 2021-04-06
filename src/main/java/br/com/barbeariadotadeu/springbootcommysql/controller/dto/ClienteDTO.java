package br.com.barbeariadotadeu.springbootcommysql.controller.dto;

import br.com.barbeariadotadeu.springbootcommysql.model.Cliente;
import br.com.barbeariadotadeu.springbootcommysql.model.Pessoa;

public class ClienteDTO {

    private int id;
    private String horaMarcada;
    private Pessoa pessoa;


    public static ClienteDTO converter(Cliente c){
        var cliente = new ClienteDTO();
        cliente.setId(c.getId());
        cliente.setHoraMarcada(c.getHoraMarcada());
        cliente.setPessoa(c.getPessoa());
        return cliente;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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