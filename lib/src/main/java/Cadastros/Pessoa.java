package Cadastros;

import java.util.Date;

public class Pessoa {
	public String nome;
	public Date datanas;
	private String cpf;
	private String endereco;
	private String num_contato;
	public String login;
	private int senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDatanas() {
		return datanas;
	}
	public void setDatanas(Date datanas) {
		this.datanas = datanas;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNum_contato() {
		return num_contato;
	}
	public void setNum_contato(String num_contato) {
		this.num_contato = num_contato;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}