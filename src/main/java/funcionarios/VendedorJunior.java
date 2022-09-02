package funcionarios;

public class VendedorJunior extends Funcionario implements CalculadoraDeComissao{

    private Double salario;
    private Double comissão = 1.4;

    public VendedorJunior(String nome, String cpf, Integer matricula, Integer dataDeNascimento) {
        super(nome, cpf, matricula, dataDeNascimento);
    }

    @Override
    public void Calculo() {
     salario = salario * 1.4;
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
