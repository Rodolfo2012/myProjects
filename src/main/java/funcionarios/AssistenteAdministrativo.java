package funcionarios;

import java.util.Date;

public class AssistenteAdministrativo extends Funcionario implements CalculadoraDeComissao{

    private Double salario;
    private Double comissao = 1.2;

    public AssistenteAdministrativo(String nome, String cpf, Integer matricula, Integer dataDeNascimento) {
        super(nome, cpf, matricula, dataDeNascimento);
    }

    @Override
    public void Calculo() {
         salario = salario * 1.2;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
}
