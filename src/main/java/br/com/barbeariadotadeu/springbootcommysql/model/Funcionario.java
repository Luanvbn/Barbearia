package br.com.barbeariadotadeu.springbootcommysql.model;

import javax.persistence.*;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tempoExp", nullable = false, unique = true)
    private int tempoExp;

    @OneToOne
    @JoinColumn(name = "idPessoa", nullable = false, unique = true)
    private Pessoa pessoa;


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
