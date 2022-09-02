package funcionarios;

public class SupervisorDeVendas extends Funcionario implements CalculadoraDeComissao{

    private Double salario;
    private Double comissão = 2.0;

    public SupervisorDeVendas(String nome, String cpf, Integer matricula, Integer dataDeNascimento) {
        super(nome, cpf, matricula, dataDeNascimento);
    }

    @Override
    public void Calculo() {
        salario = salario * 2.0;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissão() {
        return comissão;
    }

    public void setComissão(Double comissão) {
        this.comissão = comissão;
    }
}
