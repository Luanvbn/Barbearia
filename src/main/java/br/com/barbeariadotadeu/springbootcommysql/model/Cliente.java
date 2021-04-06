package br.com.barbeariadotadeu.springbootcommysql.model;


import javax.persistence.*;


@Entity
public class Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "horaMarcada", nullable = false, unique = true)
    private String horaMarcada;

    @OneToOne
    @JoinColumn(name = "idPessoa", nullable = false,unique = true)
    private Pessoa pessoa;

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
