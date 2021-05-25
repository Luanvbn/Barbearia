package br.com.barbeariadotadeu.springbootcommysql.controller.dto;

import br.com.barbeariadotadeu.springbootcommysql.model.Funcionario;
import br.com.barbeariadotadeu.springbootcommysql.model.Pessoa;

public class FuncionarioDTO {

    private int id;
    private String login;
    private String password;
    private int tempoExp;
    private Pessoa pessoa;


    public static FuncionarioDTO converter(Funcionario f){
        var funcionario = new FuncionarioDTO();
        funcionario.setId(f.getId());
        funcionario.setLogin(f.getLogin());
        funcionario.setPassword(f.getPassword());
        funcionario.setTempoExp(f.getTempoExp());
        funcionario.setPessoa(f.getPessoa());
        return funcionario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
