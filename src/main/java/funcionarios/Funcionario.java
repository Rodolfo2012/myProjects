package funcionarios;

import java.util.Date;

public class Funcionario {
    private String nome;
    private String cpf;
    private Integer matricula;
    private Integer dataDeNascimento;

    public Funcionario(String nome, String cpf, Integer matricula, Integer dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Integer dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
