package br.com.pmb.mvc.agendamento.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;

    public String telefone;

    public String Endereco;

    public String cpf;

    public String email;

    public String senha;

    @OneToMany
    public List<Agendamento> agendamentos;


}
