package br.edu.famper.funcionarios.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;

@Entity
@Table(name = "tbl_funcionario")
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "funcionario_id")
    private Long codigo;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "cargo", length = 150)
    private String cargo;

    @Column(name = "departamento", length = 50)
    private String departamento;

    @Column(name = "data admissao")
    private Calendar dataAdmissao;

    @Column(name = "e-mail", length = 150)
    private String email;

    @Column(name = "telefone", length = 20)
    private String telefone;
    
}
